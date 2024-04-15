package com.project.app.modules.search.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.project.app.modules.search.`data`.model.SearchModel
import com.project.app.modules.search.`data`.model.Userprofile2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchVM : ViewModel(), KoinComponent {
  val searchModel: MutableLiveData<SearchModel> = MutableLiveData(SearchModel())

  var navArguments: Bundle? = null

  val userprofileList: MutableLiveData<MutableList<Userprofile2RowModel>> =
      MutableLiveData(mutableListOf())
}
