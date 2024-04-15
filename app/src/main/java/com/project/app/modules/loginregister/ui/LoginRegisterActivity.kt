package com.project.app.modules.loginregister.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.project.app.R
import com.project.app.appcomponents.base.BaseActivity
import com.project.app.databinding.ActivityLoginRegisterBinding
import com.project.app.modules.login.ui.LoginActivity
import com.project.app.modules.loginregister.`data`.viewmodel.LoginRegisterVM
import kotlin.String
import kotlin.Unit

class LoginRegisterActivity :
    BaseActivity<ActivityLoginRegisterBinding>(R.layout.activity_login_register) {
  private val viewModel: LoginRegisterVM by viewModels<LoginRegisterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginRegisterVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "LOGIN_REGISTER_ACTIVITY"

    }
  }
