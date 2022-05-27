package com.start.fragment_20220527.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.start.fragment_20220527.R
import com.start.fragment_20220527.databinding.FragmentFirstBinding

class FirstFragment: Fragment() {

    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_first,container,false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.btnLog.setOnClickListener {
           Log.d("첫번째프래그먼트","테스트로그")
        }

        binding.btnLog.setOnClickListener {
            Toast.makeText(requireContext(), "프래그먼트에서 토스트띄우기", Toast.LENGTH_SHORT).show()
        }
    }

}