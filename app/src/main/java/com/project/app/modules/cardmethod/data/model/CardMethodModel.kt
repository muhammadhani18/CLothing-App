package com.project.app.modules.cardmethod.`data`.model

import com.project.app.R
import com.project.app.appcomponents.di.MyApp
import kotlin.String

data class CardMethodModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreditdebit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_credit_debit_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt632691248124: String? = MyApp.getInstance().resources.getString(R.string.msg_6326_9124)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardholder: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_holder)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJohnmorrish: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_morrish)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardsave: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_save)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredNinetyTwoThousandFortyTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_19_2042)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCamaragoes: String? =
      MyApp.getInstance().resources.getString(R.string.msg_camara_goes_here)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardnumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpirationdate: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_expiration_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt12twelve: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecuritycode: String? = MyApp.getInstance().resources.getString(R.string.lbl_security_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardholderOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_holder2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etCardNumberValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSecurityCodeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLailyfaFebrinaValue: String? = null
)
