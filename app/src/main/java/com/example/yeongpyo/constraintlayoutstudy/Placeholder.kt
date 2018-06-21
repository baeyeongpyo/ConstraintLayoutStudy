package com.example.yeongpyo.constraintlayoutstudy

import android.os.Bundle
import android.support.v4.app.Fragment
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_placeholder.*

class Placeholder : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = layoutInflater.inflate(R.layout.fragment_placeholder, container, false)
        intArrayOf(R.id.view1, R.id.view2, R.id.view3)
                .forEach { view.findViewById<View>(it).setOnClickListener(::onclick) }
        return view
    }

    fun onclick(view: View){
        TransitionManager.beginDelayedTransition(constraintLayout)
        viewholder.setContentId(view.id)
    }

}
