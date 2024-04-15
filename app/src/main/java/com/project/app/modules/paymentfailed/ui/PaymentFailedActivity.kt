package com.project.app.modules.paymentfailed.ui

import androidx.activity.viewModels
import com.project.app.R
import com.project.app.appcomponents.base.BaseActivity
import com.project.app.databinding.ActivityPaymentFailedBinding
import com.project.app.modules.paymentfailed.`data`.viewmodel.PaymentFailedVM
import kotlin.String
import kotlin.Unit

class PaymentFailedActivity :
    BaseActivity<ActivityPaymentFailedBinding>(R.layout.activity_payment_failed) {
  private val viewModel: PaymentFailedVM by viewModels<PaymentFailedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.paymentFailedVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PAYMENT_FAILED_ACTIVITY"

  }
}
