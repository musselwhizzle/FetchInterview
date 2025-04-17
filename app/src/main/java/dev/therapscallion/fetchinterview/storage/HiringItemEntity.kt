package dev.therapscallion.fetchinterview.storage

import androidx.room.Entity
import androidx.room.PrimaryKey
import dev.therapscallion.fetchinterview.network.HiringApi

@Entity
data class HiringItemEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val hiringId: Int?,
    val listId: Int?,
    val name: String?
) {
    constructor(item: HiringApi.Companion.ApiItem) : this(
        0, item.id, item.listId, item.name
    )
}