package com.example.yeongpyo.constraintlayoutstudy

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class tablayout_adapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm) {

    private var FragmentMap = HashMap<Int, Fragment>().apply {
        0 to Placeholder()
    }


    override fun getItem(position: Int): Fragment = FragmentMap[position]!!

    override fun getCount(): Int = FragmentMap.size
}