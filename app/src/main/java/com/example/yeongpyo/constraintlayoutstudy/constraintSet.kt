package com.example.yeongpyo.constraintlayoutstudy

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet
import android.support.v4.app.Fragment
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_constraint_set.*


class constraintSet : Fragment() {

    val set_main = ConstraintSet()
    val set_left = ConstraintSet()
    val set_right = ConstraintSet()
    var boo = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view  = inflater.inflate(R.layout.fragment_constraint_set, container, false)
        val mainview = view.findViewById<ConstraintLayout>(R.id.constraintLayout)
        val lefeview = view.findViewById<View>(R.id.leftview)
        val rightview = view.findViewById<View>(R.id.rightview)
        set_main.clone(mainview)
        set_left.clone(context, R.layout.fragment_constraint_set_left)
        set_right.clone(context, R.layout.fragment_constraint_set_right)

        TransitionManager.beginDelayedTransition(mainview)

        lefeview.setOnClickListener {
            if ( boo) set_main.applyTo(mainview)
            else set_left.applyTo(mainview)
            boo = !boo
        }

        rightview.setOnClickListener {
            if ( boo ) set_main.applyTo(mainview)
            else set_right.applyTo(mainview)
            boo = !boo
        }

        return view
    }
}
