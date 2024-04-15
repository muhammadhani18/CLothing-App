package com.project.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.app.R
import com.project.app.databinding.RowUserprofileBinding
import com.project.app.modules.home.`data`.model.UserprofileRowModel
import kotlin.Int
import kotlin.collections.List

class UserprofileAdapter(
  var list: List<UserprofileRowModel>
) : RecyclerView.Adapter<UserprofileAdapter.RowUserprofileVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowUserprofileVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_userprofile,parent,false)
    return RowUserprofileVH(view)
  }

  override fun onBindViewHolder(holder: RowUserprofileVH, position: Int) {
    val userprofileRowModel = UserprofileRowModel()
    // TODO uncomment following line after integration with data source
    // val userprofileRowModel = list[position]
    holder.binding.userprofileRowModel = userprofileRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<UserprofileRowModel>) {
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
      item: UserprofileRowModel
    ) {
    }
  }

  inner class RowUserprofileVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowUserprofileBinding = RowUserprofileBinding.bind(itemView)
  }
}
