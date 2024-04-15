package com.project.app.modules.sidebar.ui

import androidx.activity.viewModels
import com.project.app.R
import com.project.app.appcomponents.base.BaseActivity
import com.project.app.databinding.ActivitySidebarBinding
import com.project.app.modules.sidebar.`data`.viewmodel.SidebarVM
import kotlin.String
import kotlin.Unit

class SidebarActivity : BaseActivity<ActivitySidebarBinding>(R.layout.activity_sidebar) {
  private val viewModel: SidebarVM by viewModels<SidebarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sidebarVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIDEBAR_ACTIVITY"

  }
}
