package com.example.myapplication.ui.rooms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.FragmentRoomBinding


class RoomFragment : Fragment() {

    private var _binding: FragmentRoomBinding? = null
    private val binding get() = _binding!!
    private lateinit var rvAdapter: rv_adapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRoomBinding.inflate(inflater, container, false)
        val  view = binding.root

        rvAdapter= rv_adapter(rv_constant.getData(),requireContext())
        binding.rv.layoutManager=LinearLayoutManager(requireContext())
        binding.rv.adapter=rvAdapter

        rvAdapter.setData(rv_constant.getData())
       return view

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}