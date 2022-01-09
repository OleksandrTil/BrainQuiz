package com.example.brainquiz.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.brainquiz.R
import com.example.brainquiz.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private var mBinding: FragmentStartBinding? = null
    private val binding get() = mBinding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentStartBinding.inflate(inflater,container,false)

        val view = binding.root

        binding.btnStart.setOnClickListener {
          activity?.supportFragmentManager?.beginTransaction()?.replace(
              R.id.data_container,
              GameFragment()
          )?.commit()
        }

        return view
    }


    override fun onDestroyView() {
        super.onDestroyView()
        mBinding = null
    }

}