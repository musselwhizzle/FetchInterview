package dev.therapscallion.fetchinterview.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import dev.therapscallion.fetchinterview.R
import dev.therapscallion.fetchinterview.databinding.ActivityMainBinding
import dev.therapscallion.fetchinterview.storage.SqlSort
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: HiringViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: HiringListAdapter
    private var listJob: Job? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        adapter = HiringListAdapter()
        binding.recyclerView.adapter = adapter
        viewModel.consumeHiringList()
        bindList()

        binding.listIdBtn.setOnClickListener {
            bindList(
                listIdSort = viewModel.listIdSortOrder.inverse(),
            )
        }
        binding.nameBtn.setOnClickListener {
            bindList(
                nameSort = viewModel.nameSortOrder.inverse(),
            )
        }
    }

    private fun bindList(
        listIdSort: SqlSort? = null,
        nameSort: SqlSort? = null
    ) {
        listJob?.cancel()
        binding.recyclerView.scrollToPosition(0)
        listJob = lifecycleScope.launch {
            viewModel.getHiringFlow(
                listIdSort,
                nameSort
            ).collectLatest {
                adapter.source = it
            }
        }

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