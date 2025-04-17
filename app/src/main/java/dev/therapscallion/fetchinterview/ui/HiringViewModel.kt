package dev.therapscallion.fetchinterview.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.therapscallion.fetchinterview.business.HiringRepository
import dev.therapscallion.fetchinterview.storage.HiringItemEntity
import dev.therapscallion.fetchinterview.storage.SqlSort
import kotlinx.coroutines.flow.Flow
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

    fun getHiringFlow(
        listId: SqlSort? = null,
        name: SqlSort? = null,
    ): Flow<List<HiringItemEntity>> {
        listIdSortOrder = listId ?: listIdSortOrder
        nameSortOrder = name ?: nameSortOrder
        return repository.flowHiringItems(listIdSortOrder, nameSortOrder)
    }

    fun consumeHiringList() {
        viewModelScope.launch {
            repository.consumeHiringList()
        }
    }

}