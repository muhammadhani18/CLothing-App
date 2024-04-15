package com.project.app.modules.hometabcontainer.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.project.app.R
import com.project.app.appcomponents.di.MyApp
import com.project.app.modules.home.ui.HomeFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class HomeTabContainerActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_popular),MyApp.getInstance().resources.getString(R.string.lbl_men),MyApp.getInstance().resources.getString(R.string.lbl_women),MyApp.getInstance().resources.getString(R.string.lbl_sale))

        val viewPages: List<Fragment> =
                listOf(HomeFragment(),HomeFragment(),HomeFragment(),HomeFragment())

    }
}
