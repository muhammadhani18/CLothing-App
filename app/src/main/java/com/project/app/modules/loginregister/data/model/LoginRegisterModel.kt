package com.project.app.modules.loginregister.`data`.model

import com.project.app.R
import com.project.app.appcomponents.di.MyApp
import kotlin.String

data class LoginRegisterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_fashion)

)
