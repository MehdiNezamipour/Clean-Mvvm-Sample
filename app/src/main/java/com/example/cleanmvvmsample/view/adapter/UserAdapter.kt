package com.example.cleanmvvmsample.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanmvvmsample.databinding.UserItemLayoutBinding
import com.example.cleanmvvmsample.models.UserModel
import javax.inject.Inject

class UserAdapter @Inject constructor() :
    RecyclerView.Adapter<UserViewHolder>() {

    private val users = ArrayList<UserModel>()

    fun setItems(list: List<UserModel>) {
        users.clear()
        users.addAll(list)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            UserItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount(): Int {
        return users.size
    }


}

object DiffCallback : DiffUtil.ItemCallback<UserModel>() {
    override fun areItemsTheSame(oldItem: UserModel, newItem: UserModel) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: UserModel, newItem: UserModel) =
        oldItem == newItem
}