package com.project.app.modules.cardmethod.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.project.app.modules.cardmethod.`data`.model.CardMethodModel
import org.koin.core.KoinComponent

class CardMethodVM : ViewModel(), KoinComponent {
  val cardMethodModel: MutableLiveData<CardMethodModel> = MutableLiveData(CardMethodModel())

  var navArguments: Bundle? = null
}
