package dev.therapscallion.fetchinterview.storage

import androidx.room.EntityInsertAdapter
import androidx.room.RoomDatabase
import androidx.room.RoomRawQuery
import androidx.room.RoomSQLiteQuery
import androidx.room.coroutines.createFlow
import androidx.room.util.getColumnIndex
import androidx.room.util.performInTransactionSuspending
import androidx.room.util.performSuspending
import androidx.sqlite.SQLiteStatement
import androidx.sqlite.db.SupportSQLiteQuery
import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.MutableList
import kotlin.collections.mutableListOf
import kotlin.reflect.KClass
import kotlinx.coroutines.flow.Flow

@Generated(value = ["androidx.room.RoomProcessor"])
@Suppress(names = ["UNCHECKED_CAST", "DEPRECATION", "REDUNDANT_PROJECTION", "REMOVAL"])
public class HiringItemDao_Impl(
  __db: RoomDatabase,
) : HiringItemDao {
  private val __db: RoomDatabase

  private val __insertAdapterOfHiringItemEntity: EntityInsertAdapter<HiringItemEntity>
  init {
    this.__db = __db
    this.__insertAdapterOfHiringItemEntity = object : EntityInsertAdapter<HiringItemEntity>() {
      protected override fun createQuery(): String =
          "INSERT OR ABORT INTO `HiringItemEntity` (`id`,`hiringId`,`listId`,`name`) VALUES (nullif(?, 0),?,?,?)"

      protected override fun bind(statement: SQLiteStatement, entity: HiringItemEntity) {
        statement.bindLong(1, entity.id.toLong())
        val _tmpHiringId: Int? = entity.hiringId
        if (_tmpHiringId == null) {
          statement.bindNull(2)
        } else {
          statement.bindLong(2, _tmpHiringId.toLong())
        }
        val _tmpListId: Int? = entity.listId
        if (_tmpListId == null) {
          statement.bindNull(3)
        } else {
          statement.bindLong(3, _tmpListId.toLong())
        }
        val _tmpName: String? = entity.name
        if (_tmpName == null) {
          statement.bindNull(4)
        } else {
          statement.bindText(4, _tmpName)
        }
      }
    }
  }

  public override suspend fun insert(items: List<HiringItemEntity>): Unit = performSuspending(__db,
      false, true) { _connection ->
    __insertAdapterOfHiringItemEntity.insert(_connection, items)
  }

  public override suspend fun cleanAndInsert(items: List<HiringItemEntity>): Unit =
      performInTransactionSuspending(__db) {
    super@HiringItemDao_Impl.cleanAndInsert(items)
  }

  public override suspend fun deleteAll() {
    val _sql: String = "DELETE FROM HiringItemEntity"
    return performSuspending(__db, false, true) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        _stmt.step()
      } finally {
        _stmt.close()
      }
    }
  }

  public override fun flowHiringItems(query: SupportSQLiteQuery): Flow<List<HiringItemEntity>> {
    val _rawQuery: RoomRawQuery = RoomSQLiteQuery.copyFrom(query).toRoomRawQuery()
    val _sql: String = _rawQuery.sql
    return createFlow(__db, false, arrayOf("HiringItemEntity")) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        _rawQuery.getBindingFunction().invoke(_stmt)
        val _result: MutableList<HiringItemEntity> = mutableListOf()
        while (_stmt.step()) {
          val _item: HiringItemEntity
          _item =
              __entityStatementConverter_devTherapscallionFetchinterviewStorageHiringItemEntity(_stmt)
          _result.add(_item)
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  private
      fun __entityStatementConverter_devTherapscallionFetchinterviewStorageHiringItemEntity(statement: SQLiteStatement):
      HiringItemEntity {
    val _entity: HiringItemEntity
    val _columnIndexOfId: Int = getColumnIndex(statement, "id")
    val _columnIndexOfHiringId: Int = getColumnIndex(statement, "hiringId")
    val _columnIndexOfListId: Int = getColumnIndex(statement, "listId")
    val _columnIndexOfName: Int = getColumnIndex(statement, "name")
    val _tmpId: Int
    if (_columnIndexOfId == -1) {
      _tmpId = 0
    } else {
      _tmpId = statement.getLong(_columnIndexOfId).toInt()
    }
    val _tmpHiringId: Int?
    if (_columnIndexOfHiringId == -1) {
      _tmpHiringId = null
    } else {
      if (statement.isNull(_columnIndexOfHiringId)) {
        _tmpHiringId = null
      } else {
        _tmpHiringId = statement.getLong(_columnIndexOfHiringId).toInt()
      }
    }
    val _tmpListId: Int?
    if (_columnIndexOfListId == -1) {
      _tmpListId = null
    } else {
      if (statement.isNull(_columnIndexOfListId)) {
        _tmpListId = null
      } else {
        _tmpListId = statement.getLong(_columnIndexOfListId).toInt()
      }
    }
    val _tmpName: String?
    if (_columnIndexOfName == -1) {
      _tmpName = null
    } else {
      if (statement.isNull(_columnIndexOfName)) {
        _tmpName = null
      } else {
        _tmpName = statement.getText(_columnIndexOfName)
      }
    }
    _entity = HiringItemEntity(_tmpId,_tmpHiringId,_tmpListId,_tmpName)
    return _entity
  }

  public companion object {
    public fun getRequiredConverters(): List<KClass<*>> = emptyList()
  }
}
