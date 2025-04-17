package dev.therapscallion.fetchinterview.storage

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.RawQuery
import androidx.room.Transaction
import androidx.sqlite.db.SimpleSQLiteQuery
import androidx.sqlite.db.SupportSQLiteQuery
import kotlinx.coroutines.flow.Flow

@Dao
interface HiringItemDao {

    @Transaction
    suspend fun cleanAndInsert(items: List<HiringItemEntity>) {
        deleteAll()
        insert(items)
    }

    @Insert
    suspend fun insert(items: List<HiringItemEntity>)

    @Query("DELETE FROM HiringItemEntity")
    suspend fun deleteAll()

    @RawQuery(observedEntities = [HiringItemEntity::class])
    fun flowHiringItems(
        sortListId: SqlSort = SqlSort.ASC,
        sortName: SqlSort = SqlSort.ASC,
    ): Flow<List<HiringItemEntity>> = flowHiringItems(
        buildHiringItemsQuery(
            sortListId,
            sortName
        )
    )

    @RawQuery(observedEntities = [HiringItemEntity::class])
    fun flowHiringItems(query: SupportSQLiteQuery): Flow<List<HiringItemEntity>>

    private fun buildHiringItemsQuery(
        sortListId: SqlSort,
        sortName: SqlSort
    ): SupportSQLiteQuery {

        val query = """
        SELECT * FROM HiringItemEntity 
        WHERE name IS NOT NULL AND name != '' 
        ORDER BY listId ${sortListId.sort}, name ${sortName.sort}
    """.trimIndent()

        return SimpleSQLiteQuery(query)
    }
}