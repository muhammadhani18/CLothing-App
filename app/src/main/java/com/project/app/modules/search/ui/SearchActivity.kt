package com.project.app.modules.search.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.project.app.R
import com.project.app.appcomponents.base.BaseActivity
import com.project.app.databinding.ActivitySearchBinding
import com.project.app.modules.search.`data`.model.Userprofile2RowModel
import com.project.app.modules.search.`data`.viewmodel.SearchVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchActivity : BaseActivity<ActivitySearchBinding>(R.layout.activity_search) {
  private val viewModel: SearchVM by viewModels<SearchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val userprofileAdapter =
    UserprofileAdapter(viewModel.userprofileList.value?:mutableListOf())
    binding.recyclerUserprofile.adapter = userprofileAdapter
    userprofileAdapter.setOnItemClickListener(
    object : UserprofileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Userprofile2RowModel) {
        onClickRecyclerUserprofile(view, position, item)
      }
    }
    )
    viewModel.userprofileList.observe(this) {
      userprofileAdapter.updateData(it)
    }
    binding.searchVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerUserprofile(
    view: View,
    position: Int,
    item: Userprofile2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "SEARCH_ACTIVITY"

    }
  }
