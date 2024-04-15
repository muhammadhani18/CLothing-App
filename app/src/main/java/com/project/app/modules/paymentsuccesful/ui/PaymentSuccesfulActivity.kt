package com.project.app.modules.paymentsuccesful.ui

import androidx.activity.viewModels
import com.project.app.R
import com.project.app.appcomponents.base.BaseActivity
import com.project.app.databinding.ActivityPaymentSuccesfulBinding
import com.project.app.modules.paymentsuccesful.`data`.viewmodel.PaymentSuccesfulVM
import kotlin.String
import kotlin.Unit

class PaymentSuccesfulActivity :
    BaseActivity<ActivityPaymentSuccesfulBinding>(R.layout.activity_payment_succesful) {
  private val viewModel: PaymentSuccesfulVM by viewModels<PaymentSuccesfulVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.paymentSuccesfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PAYMENT_SUCCESFUL_ACTIVITY"

  }
}
