package com.project.app.modules.home.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.project.app.modules.home.`data`.model.HomeModel
import com.project.app.modules.home.`data`.model.UserprofileRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeVM : ViewModel(), KoinComponent {
  val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())

  var navArguments: Bundle? = null

  val userprofileList: MutableLiveData<MutableList<UserprofileRowModel>> =
      MutableLiveData(mutableListOf())
}
