package com.start.fragment_20220527.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.start.fragment_20220527.R
import com.start.fragment_20220527.databinding.FragmentSecondBinding

class SecondFragment: Fragment() {

    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.btnToast.setOnClickListener {
            Toast.makeText(requireContext(), "두번째 프래그먼트 버튼눌림=> 토스트띄우기", Toast.LENGTH_SHORT).show()
        }
        
    }
    
}