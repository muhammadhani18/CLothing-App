package com.project.app.modules.checkout.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.project.app.modules.checkout.`data`.model.CheckoutModel
import org.koin.core.KoinComponent

class CheckoutVM : ViewModel(), KoinComponent {
  val checkoutModel: MutableLiveData<CheckoutModel> = MutableLiveData(CheckoutModel())

  var navArguments: Bundle? = null
}
