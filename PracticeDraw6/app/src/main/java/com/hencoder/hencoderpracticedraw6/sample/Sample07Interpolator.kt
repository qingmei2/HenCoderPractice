package com.hencoder.hencoderpracticedraw6.sample

import android.content.Context
import android.graphics.Path
import android.support.v4.view.animation.FastOutLinearInInterpolator
import android.support.v4.view.animation.FastOutSlowInInterpolator
import android.support.v4.view.animation.LinearOutSlowInInterpolator
import android.support.v4.view.animation.PathInterpolatorCompat
import android.util.AttributeSet
import android.view.View
import android.view.animation.*
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Spinner
import com.hencoder.hencoderpracticedraw6.R
import com.hencoder.hencoderpracticedraw6.Utils

class Sample07Interpolator : LinearLayout {
    internal lateinit var spinner: Spinner
    internal lateinit var animateBt: Button
    internal lateinit var imageView: ImageView

    internal var interpolators = arrayOfNulls<Interpolator>(13)
    internal var interpolatorPath: Path

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        interpolatorPath = Path()
        interpolatorPath.lineTo(0.25f, 0.25f)
        interpolatorPath.moveTo(0.25f, 1.5f)
        interpolatorPath.lineTo(1f, 1f)
        interpolators[0] = AccelerateDecelerateInterpolator()
        interpolators[1] = LinearInterpolator()
        interpolators[2] = AccelerateInterpolator()
        interpolators[3] = DecelerateInterpolator()
        interpolators[4] = AnticipateInterpolator()
        interpolators[5] = OvershootInterpolator()
        interpolators[6] = AnticipateOvershootInterpolator()
        interpolators[7] = BounceInterpolator()
        interpolators[8] = CycleInterpolator(0.5f)
        interpolators[9] = PathInterpolatorCompat.create(interpolatorPath)
        interpolators[10] = FastOutLinearInInterpolator()
        interpolators[11] = FastOutSlowInInterpolator()
        interpolators[12] = LinearOutSlowInInterpolator()
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        spinner = findViewById<View>(R.id.interpolatorSpinner) as Spinner

        animateBt = findViewById<View>(R.id.animateBt) as Button
        imageView = findViewById<View>(R.id.imageView) as ImageView
        animateBt.setOnClickListener {
            imageView.animate()
                    .translationX(Utils.dpToPixel(150f))
                    .setDuration(600)
                    .setInterpolator(interpolators[spinner.selectedItemPosition])
                    .withEndAction { imageView.postDelayed({ imageView.translationX = 0f }, 500) }
        }
    }
}
