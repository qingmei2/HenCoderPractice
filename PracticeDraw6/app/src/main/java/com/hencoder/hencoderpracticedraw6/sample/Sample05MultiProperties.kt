package com.hencoder.hencoderpracticedraw6.sample

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.ImageView

import com.hencoder.hencoderpracticedraw6.R
import com.hencoder.hencoderpracticedraw6.Utils

class Sample05MultiProperties : ConstraintLayout {
    internal lateinit var animateBt: Button
    internal lateinit var imageView: ImageView
    internal var animated: Boolean = false

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
            if (!animated) {
                imageView.animate()
                        .translationX(Utils.dpToPixel(200f))
                        .rotation(360f)
                        .scaleX(1f)
                        .scaleY(1f)
                        .alpha(1f)
            } else {
                imageView.animate()
                        .translationX(0f)
                        .rotation(0f)
                        .scaleX(0f)
                        .scaleY(0f)
                        .alpha(0f)
            }
            animated = !animated
        }
    }
}
