package com.example.cleanmvvmsample.view.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.cleanmvvmsample.databinding.UserItemLayoutBinding
import com.example.cleanmvvmsample.models.UserModel

class UserViewHolder(
    private val binding: UserItemLayoutBinding,
) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(userModel: UserModel) {
        binding.name.text = userModel.name
        binding.email.text = userModel.email
    }


}