package com.project.app.modules.home.`data`.model

import com.project.app.R
import com.project.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFiltersort: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter_sort)

)
