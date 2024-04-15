package com.project.app.modules.paymentsuccesful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.project.app.modules.paymentsuccesful.`data`.model.PaymentSuccesfulModel
import org.koin.core.KoinComponent

class PaymentSuccesfulVM : ViewModel(), KoinComponent {
  val paymentSuccesfulModel: MutableLiveData<PaymentSuccesfulModel> =
      MutableLiveData(PaymentSuccesfulModel())

  var navArguments: Bundle? = null
}
