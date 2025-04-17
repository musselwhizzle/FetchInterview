package dev.therapscallion.fetchinterview.storage

import androidx.room.InvalidationTracker
import androidx.room.RoomOpenDelegate
import androidx.room.migration.AutoMigrationSpec
import androidx.room.migration.Migration
import androidx.room.util.TableInfo
import androidx.room.util.TableInfo.Companion.read
import androidx.room.util.dropFtsSyncTriggers
import androidx.sqlite.SQLiteConnection
import androidx.sqlite.execSQL
import javax.`annotation`.processing.Generated
import kotlin.Lazy
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList
import kotlin.collections.MutableMap
import kotlin.collections.MutableSet
import kotlin.collections.Set
import kotlin.collections.mutableListOf
import kotlin.collections.mutableMapOf
import kotlin.collections.mutableSetOf
import kotlin.reflect.KClass

@Generated(value = ["androidx.room.RoomProcessor"])
@Suppress(names = ["UNCHECKED_CAST", "DEPRECATION", "REDUNDANT_PROJECTION", "REMOVAL"])
public class FetchDb_Impl : FetchDb() {
  private val _hiringItemDao: Lazy<HiringItemDao> = lazy {
    HiringItemDao_Impl(this)
  }

  protected override fun createOpenDelegate(): RoomOpenDelegate {
    val _openDelegate: RoomOpenDelegate = object : RoomOpenDelegate(1,
        "5af42d3e787f5d6317e0c94365f2560b", "42d30293a2aec4bad01b087ea2fd9a07") {
      public override fun createAllTables(connection: SQLiteConnection) {
        connection.execSQL("CREATE TABLE IF NOT EXISTS `HiringItemEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hiringId` INTEGER, `listId` INTEGER, `name` TEXT)")
        connection.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)")
        connection.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5af42d3e787f5d6317e0c94365f2560b')")
      }

      public override fun dropAllTables(connection: SQLiteConnection) {
        connection.execSQL("DROP TABLE IF EXISTS `HiringItemEntity`")
      }

      public override fun onCreate(connection: SQLiteConnection) {
      }

      public override fun onOpen(connection: SQLiteConnection) {
        internalInitInvalidationTracker(connection)
      }

      public override fun onPreMigrate(connection: SQLiteConnection) {
        dropFtsSyncTriggers(connection)
      }

      public override fun onPostMigrate(connection: SQLiteConnection) {
      }

      public override fun onValidateSchema(connection: SQLiteConnection):
          RoomOpenDelegate.ValidationResult {
        val _columnsHiringItemEntity: MutableMap<String, TableInfo.Column> = mutableMapOf()
        _columnsHiringItemEntity.put("id", TableInfo.Column("id", "INTEGER", true, 1, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsHiringItemEntity.put("hiringId", TableInfo.Column("hiringId", "INTEGER", false, 0,
            null, TableInfo.CREATED_FROM_ENTITY))
        _columnsHiringItemEntity.put("listId", TableInfo.Column("listId", "INTEGER", false, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsHiringItemEntity.put("name", TableInfo.Column("name", "TEXT", false, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        val _foreignKeysHiringItemEntity: MutableSet<TableInfo.ForeignKey> = mutableSetOf()
        val _indicesHiringItemEntity: MutableSet<TableInfo.Index> = mutableSetOf()
        val _infoHiringItemEntity: TableInfo = TableInfo("HiringItemEntity",
            _columnsHiringItemEntity, _foreignKeysHiringItemEntity, _indicesHiringItemEntity)
        val _existingHiringItemEntity: TableInfo = read(connection, "HiringItemEntity")
        if (!_infoHiringItemEntity.equals(_existingHiringItemEntity)) {
          return RoomOpenDelegate.ValidationResult(false, """
              |HiringItemEntity(dev.therapscallion.fetchinterview.storage.HiringItemEntity).
              | Expected:
              |""".trimMargin() + _infoHiringItemEntity + """
              |
              | Found:
              |""".trimMargin() + _existingHiringItemEntity)
        }
        return RoomOpenDelegate.ValidationResult(true, null)
      }
    }
    return _openDelegate
  }

  protected override fun createInvalidationTracker(): InvalidationTracker {
    val _shadowTablesMap: MutableMap<String, String> = mutableMapOf()
    val _viewTables: MutableMap<String, Set<String>> = mutableMapOf()
    return InvalidationTracker(this, _shadowTablesMap, _viewTables, "HiringItemEntity")
  }

  public override fun clearAllTables() {
    super.performClear(false, "HiringItemEntity")
  }

  protected override fun getRequiredTypeConverterClasses(): Map<KClass<*>, List<KClass<*>>> {
    val _typeConvertersMap: MutableMap<KClass<*>, List<KClass<*>>> = mutableMapOf()
    _typeConvertersMap.put(HiringItemDao::class, HiringItemDao_Impl.getRequiredConverters())
    return _typeConvertersMap
  }

  public override fun getRequiredAutoMigrationSpecClasses(): Set<KClass<out AutoMigrationSpec>> {
    val _autoMigrationSpecsSet: MutableSet<KClass<out AutoMigrationSpec>> = mutableSetOf()
    return _autoMigrationSpecsSet
  }

  public override
      fun createAutoMigrations(autoMigrationSpecs: Map<KClass<out AutoMigrationSpec>, AutoMigrationSpec>):
      List<Migration> {
    val _autoMigrations: MutableList<Migration> = mutableListOf()
    return _autoMigrations
  }

  public override fun getHiringItemDao(): HiringItemDao = _hiringItemDao.value
}
