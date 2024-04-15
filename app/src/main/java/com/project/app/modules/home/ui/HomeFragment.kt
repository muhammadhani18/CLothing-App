package com.project.app.modules.home.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.project.app.R
import com.project.app.appcomponents.base.BaseFragment
import com.project.app.databinding.FragmentHomeBinding
import com.project.app.modules.home.`data`.model.UserprofileRowModel
import com.project.app.modules.home.`data`.viewmodel.HomeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val userprofileAdapter =
    UserprofileAdapter(viewModel.userprofileList.value?:mutableListOf())
    binding.recyclerUserprofile.adapter = userprofileAdapter
    userprofileAdapter.setOnItemClickListener(
    object : UserprofileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : UserprofileRowModel) {
        onClickRecyclerUserprofile(view, position, item)
      }
    }
    )
    viewModel.userprofileList.observe(requireActivity()) {
      userprofileAdapter.updateData(it)
    }
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerUserprofile(
    view: View,
    position: Int,
    item: UserprofileRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_FRAGMENT"

  }
}
