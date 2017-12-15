package com.hencoder.hencoderpracticedraw5.sample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import com.hencoder.hencoderpracticedraw5.R

class Sample01AfterOnDrawView : AppCompatImageView {

    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        paint.color = Color.parseColor("#FFC107")
        paint.textSize = 28f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        if (DEBUG) {
            // 在 debug 模式下绘制出 drawable 的尺寸信息
            val drawable = drawable
            if (drawable != null) {
                canvas.save()
                canvas.concat(imageMatrix)
                val bounds = drawable.bounds
                canvas.drawText(resources.getString(R.string.image_size, bounds.width(), bounds.height()), 20f, 40f, paint)
                canvas.restore()
            }
        }
    }

    companion object {
        val DEBUG = true
    }
}
