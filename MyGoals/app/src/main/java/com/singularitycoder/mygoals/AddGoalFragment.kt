package com.singularitycoder.mygoals

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.singularitycoder.mygoals.databinding.FragmentAddGoalBinding

class AddGoalFragment : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance() = AddGoalFragment()
    }

    private lateinit var binding: FragmentAddGoalBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentAddGoalBinding.inflate(inflater, container, false)
        return binding.root
    }
}