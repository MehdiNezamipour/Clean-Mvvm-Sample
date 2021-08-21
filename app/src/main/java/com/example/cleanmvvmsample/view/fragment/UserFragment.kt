package com.example.cleanmvvmsample.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.cleanmvvmsample.databinding.FragmentUserBinding
import com.example.cleanmvvmsample.view.adapter.UserAdapter
import com.example.cleanmvvmsample.viewmodel.UserFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class UserFragment : Fragment() {

    @Inject
    lateinit var adapter: UserAdapter

    private lateinit var binding: FragmentUserBinding

    private val viewModel: UserFragmentViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.getUsers()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUserBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.users.observe(viewLifecycleOwner, {
            adapter.setItems(it)
        })

        binding.userRecyclerView.adapter = adapter



    }


}