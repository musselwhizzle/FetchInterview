package dev.therapscallion.fetchinterview.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import dev.therapscallion.fetchinterview.R
import dev.therapscallion.fetchinterview.databinding.ActivityMainBinding
import dev.therapscallion.fetchinterview.network.Result
import dev.therapscallion.fetchinterview.storage.SqlSort
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: HiringViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: HiringListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        adapter = HiringListAdapter()
        binding.recyclerView.adapter = adapter
        viewModel.consumeHiringList()

        lifecycleScope.launch {
            viewModel.results.collectLatest {
                when (it) {
                    is Result.Success -> {
                        binding.recyclerView.scrollToPosition(0)
                        adapter.source = it.data
                    }
                    is Result.Error -> {
                        adapter.source = emptyList()
                        Toast.makeText(this@MainActivity,
                            "Error Loading Data",
                            Toast.LENGTH_SHORT).show()
                    }
                    null -> {
                        adapter.source = emptyList()
                    }
                }
            }
        }

        bindArrows()
        binding.listIdBtn.setOnClickListener {
            viewModel.updateSortOrder(
                listIdSort = viewModel.listIdSortOrder.inverse()
            )
            bindArrows()
        }
        binding.nameBtn.setOnClickListener {
            viewModel.updateSortOrder(
                listIdSort = viewModel.listIdSortOrder.inverse()
            )
            bindArrows()
        }
    }

    private fun bindArrows() {
        binding.listIdSort.setImageResource(
            getArrowFromSortOrder(viewModel.listIdSortOrder)
        )
        binding.nameSort.setImageResource(
            getArrowFromSortOrder(viewModel.nameSortOrder)
        )
    }

    private fun getArrowFromSortOrder(sort: SqlSort): Int {
        return if (sort == SqlSort.ASC) {
            R.drawable.ic_arrow_up
        } else {
            R.drawable.ic_arrow_down
        }
    }
}