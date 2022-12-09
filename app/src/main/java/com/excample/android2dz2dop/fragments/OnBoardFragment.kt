package com.excample.android2dz2dop.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.excample.android2dz2dop.R
import com.excample.android2dz2dop.adapters.ViewPagerAdapter
import com.excample.android2dz2dop.databinding.FragmentOnBoardBinding
import com.google.android.material.tabs.TabLayoutMediator


class OnBoardFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, pos ->
            when (pos) {
                0 -> tab.setIcon(R.drawable.ic_one)
                1 -> tab.setIcon(R.drawable.ic_two)
                2 -> tab.setIcon(R.drawable.ic_three)
            }


        }.attach()
        initialize()
    }

    private fun initialize() {
        binding.viewPager.adapter = ViewPagerAdapter(this@OnBoardFragment)

    }
}




