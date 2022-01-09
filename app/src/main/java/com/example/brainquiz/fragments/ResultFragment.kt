package com.example.brainquiz.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.brainquiz.R
import com.example.brainquiz.databinding.FragmentResultBinding
import com.example.brainquiz.screen.MainActivity
import com.example.brainquiz.viewmodel.MainViewModel


class ResultFragment : Fragment() {


    private var mBinding: FragmentResultBinding? = null
    private val binding get() = mBinding!!
    private lateinit var vm: MainViewModel
    private var mContext: Context? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentResultBinding.inflate(inflater, container, false)
        vm = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        val view = binding.root

        binding.btnNewGame.setOnClickListener {
            vm.clear()
            activity?.supportFragmentManager?.beginTransaction()?.replace(
                R.id.data_container,
                StartFragment()
            )?.addToBackStack(null)?.commit()
        }

        binding.tvResult.text = "Правильных ответов: ${vm.progressLive.value?.true_answer_counter.toString()}"

        return view
    }


    override fun onDestroyView() {
        super.onDestroyView()
        mBinding = null
    }

}