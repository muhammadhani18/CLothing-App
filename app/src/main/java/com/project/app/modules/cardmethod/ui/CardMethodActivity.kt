package com.project.app.modules.cardmethod.ui

import androidx.activity.viewModels
import com.project.app.R
import com.project.app.appcomponents.base.BaseActivity
import com.project.app.databinding.ActivityCardMethodBinding
import com.project.app.modules.cardmethod.`data`.viewmodel.CardMethodVM
import kotlin.String
import kotlin.Unit

class CardMethodActivity : BaseActivity<ActivityCardMethodBinding>(R.layout.activity_card_method) {
  private val viewModel: CardMethodVM by viewModels<CardMethodVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cardMethodVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CARD_METHOD_ACTIVITY"

  }
}
