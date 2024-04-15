package com.project.app.modules.paymentfailed.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.project.app.modules.paymentfailed.`data`.model.PaymentFailedModel
import org.koin.core.KoinComponent

class PaymentFailedVM : ViewModel(), KoinComponent {
  val paymentFailedModel: MutableLiveData<PaymentFailedModel> =
      MutableLiveData(PaymentFailedModel())

  var navArguments: Bundle? = null
}
