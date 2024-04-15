package com.project.app.modules.register.ui

import androidx.activity.viewModels
import com.project.app.R
import com.project.app.appcomponents.base.BaseActivity
import com.project.app.databinding.ActivityRegisterBinding
import com.project.app.modules.register.`data`.viewmodel.RegisterVM
import kotlin.String
import kotlin.Unit

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(R.layout.activity_register) {
  private val viewModel: RegisterVM by viewModels<RegisterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "REGISTER_ACTIVITY"

  }
}
