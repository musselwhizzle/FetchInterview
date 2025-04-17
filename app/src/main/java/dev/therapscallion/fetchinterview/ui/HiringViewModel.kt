package dev.therapscallion.fetchinterview.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.therapscallion.fetchinterview.business.HiringRepository
import dev.therapscallion.fetchinterview.network.Result
import dev.therapscallion.fetchinterview.storage.HiringItemEntity
import dev.therapscallion.fetchinterview.storage.SqlSort
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HiringViewModel @Inject constructor(
    private val repository: HiringRepository
) : ViewModel() {

    var listIdSortOrder = SqlSort.ASC
        private set
    var nameSortOrder = SqlSort.ASC
        private set

    private var job: Job? = null

    private val _results = MutableStateFlow<Result<List<HiringItemEntity>>?>(null)
    val results: Flow<Result<List<HiringItemEntity>>?> = _results

    init {
        startCollection()
    }

    fun updateSortOrder(
        listIdSort: SqlSort? = null, nameSort: SqlSort? = null
    ) {
        listIdSortOrder = listIdSort ?: listIdSortOrder
        nameSortOrder = nameSort ?: nameSortOrder
        startCollection()
    }

    private fun startCollection() {
        job?.cancel()
        job = viewModelScope.launch {
            getHiringFlow().catch { e ->
                    _results.value = Result.Error(e as Exception)
                }.collect { hiringList ->
                    _results.value = Result.Success(hiringList)
                }
        }
    }


    private fun getHiringFlow(): Flow<List<HiringItemEntity>> {
        return repository.flowHiringItems(listIdSortOrder, nameSortOrder)
    }

    fun consumeHiringList() {
        viewModelScope.launch {
            val rsp = repository.consumeHiringList()
            if (rsp is Result.Error) {
                _results.value = rsp
            }
        }
    }

}