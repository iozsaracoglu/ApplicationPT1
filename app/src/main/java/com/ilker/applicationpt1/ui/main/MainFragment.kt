package com.ilker.applicationpt1.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.ilker.applicationpt1.R
import com.ilker.applicationpt1.databinding.MainFragmentBinding


class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    // ilker
    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // ilker
        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.main_fragment,
            container,
            false
        )
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.button.setOnClickListener{ onClicked() }

        //binding.playGameButton.setOnClickListener {
        //            findNavController().navigate(TitleFragmentDirections.actionTitleToGame())
        //        }
        binding.buttonNext.setOnClickListener { onClickedNext() }

        // ilker
        //return inflater.inflate(R.layout.main_fragment, container, false)
        return binding.root
    }

    // ilker
    private fun onClicked() {
        viewModel.onClick()
        binding.message.text = viewModel.cnt.toString()
    }
    private fun onClickedNext() {
        Log.i("ilkerdebug","onClickedNext")

        findNavController().navigate(R.id.action_mainFragment_to_nextFragment)

        //findNavController().navigate()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}