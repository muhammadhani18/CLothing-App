package com.project.app.modules.hometabcontainer.ui

import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.project.app.R
import com.project.app.appcomponents.base.BaseActivity
import com.project.app.databinding.ActivityHomeTabContainerBinding
import com.project.app.modules.hometabcontainer.`data`.viewmodel.HomeTabContainerVM
import kotlin.String
import kotlin.Unit

class HomeTabContainerActivity :
    BaseActivity<ActivityHomeTabContainerBinding>(R.layout.activity_home_tab_container) {
  private val viewModel: HomeTabContainerVM by viewModels<HomeTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeTabContainerVM = viewModel
    val adapter = HomeTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutTabview,binding.viewPagerViewpager) { tab, position ->
      tab.text = HomeTabContainerActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "HOME_TAB_CONTAINER_ACTIVITY"

    }
  }
