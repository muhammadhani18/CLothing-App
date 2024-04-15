package com.project.app.modules.paymentfailed.`data`.model

import com.project.app.R
import com.project.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentFailedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOhsnaporder: String? =
      MyApp.getInstance().resources.getString(R.string.msg_oh_snap_order_failed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_looks_like_something)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)

)
