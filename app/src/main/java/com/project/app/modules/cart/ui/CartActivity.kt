package com.project.app.modules.cart.ui

import android.view.View
import androidx.activity.viewModels
import com.project.app.R
import com.project.app.appcomponents.base.BaseActivity
import com.project.app.databinding.ActivityCartBinding
import com.project.app.modules.cart.`data`.model.Userprofile1RowModel
import com.project.app.modules.cart.`data`.viewmodel.CartVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CartActivity : BaseActivity<ActivityCartBinding>(R.layout.activity_cart) {
  private val viewModel: CartVM by viewModels<CartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val userprofileAdapter =
    UserprofileAdapter(viewModel.userprofileList.value?:mutableListOf())
    binding.recyclerUserprofile.adapter = userprofileAdapter
    userprofileAdapter.setOnItemClickListener(
    object : UserprofileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Userprofile1RowModel) {
        onClickRecyclerUserprofile(view, position, item)
      }
    }
    )
    viewModel.userprofileList.observe(this) {
      userprofileAdapter.updateData(it)
    }
    binding.cartVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerUserprofile(
    view: View,
    position: Int,
    item: Userprofile1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CART_ACTIVITY"

  }
}
