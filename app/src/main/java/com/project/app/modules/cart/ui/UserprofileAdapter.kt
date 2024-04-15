package com.project.app.modules.cart.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.app.R
import com.project.app.databinding.RowUserprofile1Binding
import com.project.app.modules.cart.`data`.model.Userprofile1RowModel
import kotlin.Int
import kotlin.collections.List

class UserprofileAdapter(
  var list: List<Userprofile1RowModel>
) : RecyclerView.Adapter<UserprofileAdapter.RowUserprofile1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowUserprofile1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_userprofile1,parent,false)
    return RowUserprofile1VH(view)
  }

  override fun onBindViewHolder(holder: RowUserprofile1VH, position: Int) {
    val userprofile1RowModel = Userprofile1RowModel()
    // TODO uncomment following line after integration with data source
    // val userprofile1RowModel = list[position]
    holder.binding.userprofile1RowModel = userprofile1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Userprofile1RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Userprofile1RowModel
    ) {
    }
  }

  inner class RowUserprofile1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowUserprofile1Binding = RowUserprofile1Binding.bind(itemView)
  }
}
