package com.hencoder.hencoderpracticedraw6.practice

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.ImageView

import com.hencoder.hencoderpracticedraw6.R

class Practice05MultiProperties : ConstraintLayout {
    internal lateinit var animateBt: Button
    internal lateinit var imageView: ImageView

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        animateBt = findViewById<View>(R.id.animateBt) as Button
        imageView = findViewById<View>(R.id.imageView) as ImageView
        imageView.scaleX = 0f
        imageView.scaleY = 0f
        imageView.alpha = 0f
        animateBt.setOnClickListener {
            // TODO 在这里处理点击事件，同时对多个属性做动画
        }
    }
}
