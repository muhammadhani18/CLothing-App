package com.project.app.modules.paymentsuccesful.`data`.model

import com.project.app.R
import com.project.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentSuccesfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratsyour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congrats_your_order)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_items_has_been)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)

)
