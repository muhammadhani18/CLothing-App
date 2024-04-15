package com.project.app.modules.search.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.app.R
import com.project.app.databinding.RowUserprofile2Binding
import com.project.app.modules.search.`data`.model.Userprofile2RowModel
import kotlin.Int
import kotlin.collections.List

class UserprofileAdapter(
  var list: List<Userprofile2RowModel>
) : RecyclerView.Adapter<UserprofileAdapter.RowUserprofile2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowUserprofile2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_userprofile2,parent,false)
    return RowUserprofile2VH(view)
  }

  override fun onBindViewHolder(holder: RowUserprofile2VH, position: Int) {
    val userprofile2RowModel = Userprofile2RowModel()
    // TODO uncomment following line after integration with data source
    // val userprofile2RowModel = list[position]
    holder.binding.userprofile2RowModel = userprofile2RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Userprofile2RowModel>) {
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
      item: Userprofile2RowModel
    ) {
    }
  }

  inner class RowUserprofile2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowUserprofile2Binding = RowUserprofile2Binding.bind(itemView)
  }
}
