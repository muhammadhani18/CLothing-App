package com.project.app.modules.checkout.ui

import androidx.fragment.app.viewModels
import com.project.app.R
import com.project.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.project.app.databinding.BottomsheetCheckoutBinding
import com.project.app.modules.checkout.`data`.viewmodel.CheckoutVM
import kotlin.String
import kotlin.Unit

class CheckoutBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetCheckoutBinding>(R.layout.bottomsheet_checkout) {
  private val viewModel: CheckoutVM by viewModels<CheckoutVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.checkoutVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CHECKOUT_BOTTOMSHEET"

  }
}
