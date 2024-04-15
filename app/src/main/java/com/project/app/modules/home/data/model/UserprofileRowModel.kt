package com.project.app.modules.home.`data`.model

import com.project.app.R
import com.project.app.appcomponents.di.MyApp
import kotlin.String

data class UserprofileRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAres: String? = MyApp.getInstance().resources.getString(R.string.lbl_ares)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRp100000: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp100_000)

)
