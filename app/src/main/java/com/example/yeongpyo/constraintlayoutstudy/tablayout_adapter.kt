package com.example.yeongpyo.constraintlayoutstudy

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class tablayout_adapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm) {

    private var FragmentMap = HashMap<String, Fragment>().apply {
        put("page 1", Placeholder())
    }

    override fun getItem(position: Int): Fragment = FragmentMap.toList()[position].second
    override fun getPageTitle(position: Int): CharSequence? = FragmentMap.toList()[position].first
    override fun getCount(): Int = FragmentMap.size

}