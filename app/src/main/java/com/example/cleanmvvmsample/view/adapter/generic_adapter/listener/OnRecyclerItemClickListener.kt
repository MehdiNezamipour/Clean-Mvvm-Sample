package com.example.cleanmvvmsample.view.adapter.generic_adapter.listener

interface OnRecyclerItemClickListener : BaseRecyclerListener {
    /**
     * Returns clicked item position [RecyclerView.ViewHolder.getAdapterPosition]
     *
     * @param position clicked item position.
     */
    fun onItemClick(position: Int)
}