package com.project.app.modules.cart.`data`.model

import com.project.app.R
import com.project.app.appcomponents.di.MyApp
import kotlin.String

data class Userprofile1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAresTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_ares)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRp100000: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp100_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)
