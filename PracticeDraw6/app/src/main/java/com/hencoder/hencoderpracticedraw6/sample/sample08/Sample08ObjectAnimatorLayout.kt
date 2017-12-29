package com.hencoder.hencoderpracticedraw6.sample.sample08

import android.animation.ObjectAnimator
import android.content.Context
import android.support.v4.view.animation.FastOutSlowInInterpolator
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout

import com.hencoder.hencoderpracticedraw6.R

class Sample08ObjectAnimatorLayout : RelativeLayout {
    internal lateinit var view: Sample08ObjectAnimatorView
    internal lateinit var animateBt: Button

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        view = findViewById<View>(R.id.objectAnimatorView) as Sample08ObjectAnimatorView
        animateBt = findViewById<View>(R.id.animateBt) as Button

        animateBt.setOnClickListener {
            val animator = ObjectAnimator.ofFloat(view, "progress", 0f, 65f)
            animator.setDuration(1000)
            animator.setInterpolator(FastOutSlowInInterpolator())
            animator.start()
        }
    }
}
