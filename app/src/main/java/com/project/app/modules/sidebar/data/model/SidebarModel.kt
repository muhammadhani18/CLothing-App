package com.project.app.modules.sidebar.`data`.model

import com.project.app.R
import com.project.app.appcomponents.di.MyApp
import kotlin.String

data class SidebarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFullname: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_gmail_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrders: String? = MyApp.getInstance().resources.getString(R.string.lbl_orders)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMydetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivery: String? = MyApp.getInstance().resources.getString(R.string.msg_delivery_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentmethods: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_methods)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPromocord: String? = MyApp.getInstance().resources.getString(R.string.lbl_promo_cord)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifecations: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifecations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelp: String? = MyApp.getInstance().resources.getString(R.string.lbl_help)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbout: String? = MyApp.getInstance().resources.getString(R.string.lbl_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_out)

)
