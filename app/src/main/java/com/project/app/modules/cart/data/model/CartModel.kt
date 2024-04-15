package com.project.app.modules.cart.`data`.model

import com.project.app.R
import com.project.app.appcomponents.di.MyApp
import kotlin.String

data class CartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_cart)

)
