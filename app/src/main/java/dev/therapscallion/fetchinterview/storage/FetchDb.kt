package dev.therapscallion.fetchinterview.storage

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [HiringItemEntity::class], version = 1)
abstract class FetchDb : RoomDatabase() {
    abstract fun getHiringItemDao(): HiringItemDao
}