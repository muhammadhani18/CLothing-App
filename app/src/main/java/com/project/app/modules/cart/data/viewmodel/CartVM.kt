package com.project.app.modules.cart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.project.app.modules.cart.`data`.model.CartModel
import com.project.app.modules.cart.`data`.model.Userprofile1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CartVM : ViewModel(), KoinComponent {
  val cartModel: MutableLiveData<CartModel> = MutableLiveData(CartModel())

  var navArguments: Bundle? = null

  val userprofileList: MutableLiveData<MutableList<Userprofile1RowModel>> =
      MutableLiveData(mutableListOf())
}
