package com.project.app.modules.hometabcontainer.`data`.model

import com.project.app.R
import com.project.app.appcomponents.di.MyApp
import kotlin.String

data class HomeTabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupseventytwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupseventyone: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)
