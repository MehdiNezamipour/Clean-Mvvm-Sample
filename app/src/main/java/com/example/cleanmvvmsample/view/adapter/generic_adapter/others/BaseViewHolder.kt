package com.example.cleanmvvmsample.view.adapter.generic_adapter.others

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanmvvmsample.view.adapter.generic_adapter.listener.BaseRecyclerListener


/**
 * Base ViewHolder to be used with the generic adapter.
 * [GenericRecyclerViewAdapter]
 *
 * @param <T> type of objects, which will be used in the adapter's data set
 * @param <L> click listener [BaseRecyclerListener]
 * @author Leonid Ustenko (Leo.Droidcoder@gmail.com)
 * @since 1.0.0
</L></T> */
abstract class BaseViewHolder<T, L : BaseRecyclerListener?> : RecyclerView.ViewHolder {
    private var listener: L? = null

    constructor(itemView: View) : super(itemView)
    constructor(itemView: View, listener: L) : super(itemView) {
        this.listener = listener
    }

    /**
     * Bind data to the item.
     * Make sure not to perform any expensive operations here.
     *
     * @param item object, associated with the item.
     * @author Leonid Ustenko (Leo.Droidcoder@gmail.com)
     * @since 1.0.0
     */
    abstract fun onBind(item: T)

    /**
     * Bind data to the item.
     * Override this method for using the payloads in order to achieve the full power of DiffUtil
     * [android.support.v7.util.DiffUtil.Callback]
     *
     * @param item object, associated with the item.
     * @author Leonid Ustenko (Leo.Droidcoder@gmail.com)
     * @since 1.0.0
     */
    fun onBind(item: T, payloads: List<Any?>?) {
        onBind(item)
    }
}