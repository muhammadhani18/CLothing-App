package com.project.app.modules.checkout.`data`.model

import com.project.app.R
import com.project.app.appcomponents.di.MyApp
import kotlin.String

data class CheckoutModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckout: String? = MyApp.getInstance().resources.getString(R.string.lbl_checkout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectmethod: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPament: String? = MyApp.getInstance().resources.getString(R.string.lbl_pament)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPromocode: String? = MyApp.getInstance().resources.getString(R.string.lbl_promo_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPickdiscount: String? = MyApp.getInstance().resources.getString(R.string.lbl_pick_discount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeZone: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_cost)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRp350000: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp350_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndConditio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_placing_an_order)

)
