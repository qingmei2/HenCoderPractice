package com.hencoder.hencoderpracticedraw6.sample

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout

import com.hencoder.hencoderpracticedraw6.R

class Sample02Rotation : RelativeLayout {
    internal lateinit var animateBt: Button
    internal lateinit var imageView: ImageView

    internal var state = 0

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        animateBt = findViewById<View>(R.id.animateBt) as Button
        imageView = findViewById<View>(R.id.imageView) as ImageView

        animateBt.setOnClickListener {
            when (state) {
                0 -> imageView.animate().rotation(180f)
                1 -> imageView.animate().rotation(0f)
                2 -> imageView.animate().rotationX(180f)
                3 -> imageView.animate().rotationX(0f)
                4 -> imageView.animate().rotationY(180f)
                5 -> imageView.animate().rotationY(0f)
            }
            state++
            if (state == 6) {
                state = 0
            }
        }
    }
}