package com.grid.travel.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.grid.travel.R
import com.grid.travel.databinding.FragmentMainBinding
import com.grid.travel.ui.main.travellist.TravelListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by activityViewModels()
    private lateinit var mainBinding: FragmentMainBinding
    private lateinit var travelListAdapter: TravelListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mainBinding = FragmentMainBinding.inflate(inflater, container, false)
        return mainBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTravelRecyclerView(view)
    }

    private fun setTravelRecyclerView(view: View) {
        mainBinding.travelMainRecyclerView.apply {
            layoutManager = GridLayoutManager(view.context, 3, RecyclerView.VERTICAL, false)
            adapter = TravelListAdapter().apply { travelListAdapter = this }
        }
    }
}