package com.project.app.modules.search.`data`.model

import com.project.app.R
import com.project.app.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindproducts: String? = MyApp.getInstance().resources.getString(R.string.lbl_find_products)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt6itemsfound: String? =
      MyApp.getInstance().resources.getString(R.string.msg_6_items_found_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWecouldnt: String? = MyApp.getInstance().resources.getString(R.string.msg_we_couldn_t_find)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLookingfor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_looking_for_another)

)
