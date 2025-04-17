package dev.therapscallion.fetchinterview.business

import dev.therapscallion.fetchinterview.network.HiringApi
import dev.therapscallion.fetchinterview.network.Result
import dev.therapscallion.fetchinterview.storage.HiringItemDao
import dev.therapscallion.fetchinterview.storage.HiringItemEntity
import dev.therapscallion.fetchinterview.storage.SqlSort
import javax.inject.Inject

class HiringRepository @Inject constructor(
    private val fetchApi: HiringApi,
    private val hiringDao: HiringItemDao
) {

    fun flowHiringItems(
        sortListId: SqlSort,
        sortName: SqlSort
    ) = hiringDao.flowHiringItems(sortListId, sortName)

    suspend fun consumeHiringList(): Result<List<HiringItemEntity>?> {
        return try {
            val rsp = fetchApi.getHiring()
            if (rsp.isSuccessful) {
                rsp.body()?.let { results ->
                    val mapped = results.map { HiringItemEntity(it) }
                    hiringDao.cleanAndInsert(mapped)
                    Result.Success(mapped)
                } ?: Result.Error(Exception("Response body was null"))
            } else {
                Result.Error(Exception(
                    "Network request failed with code ${rsp.code()}")
                )
            }
        } catch (e : Exception) {
            Result.Error(e)
        }
    }
}