package com.project.app.modules.search.`data`.model

import com.project.app.R
import com.project.app.appcomponents.di.MyApp
import kotlin.String

data class Userprofile2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtClown: String? = MyApp.getInstance().resources.getString(R.string.lbl_clown)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRp300000: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp300_000)

)
