package dev.therapscallion.fetchinterview.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.therapscallion.fetchinterview.databinding.ItemHiringBinding
import dev.therapscallion.fetchinterview.storage.HiringItemEntity

class HiringListAdapter() : RecyclerView.Adapter<HiringListAdapter.Companion.ItemHolder>() {

    var source: List<HiringItemEntity> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemHolder {
        val binding = ItemHiringBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ItemHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ItemHolder,
        position: Int
    ) {
        holder.bind(source.getOrNull(position))
    }

    override fun getItemCount(): Int {
        return source.size
    }

    companion object {

        class ItemHolder(private val item: ItemHiringBinding) :
            RecyclerView.ViewHolder(item.root) {

            fun bind(data: HiringItemEntity?) {
                item.listId.text = data?.listId?.toString() ?: ""
                item.name.text = data?.name?.toString() ?: ""
            }
        }
    }

}