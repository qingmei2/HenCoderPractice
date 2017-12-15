package com.hencoder.hencoderpracticedraw5.sample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet

class Sample07AfterDrawView : AppCompatImageView {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        paint.textSize = 60f
    }

    override fun draw(canvas: Canvas) {
        super.draw(canvas)

        paint.color = Color.parseColor("#f44336")
        canvas.drawRect(0f, 40f, 200f, 120f, paint)
        paint.color = Color.WHITE
        canvas.drawText("New", 20f, 100f, paint)
    }
}
