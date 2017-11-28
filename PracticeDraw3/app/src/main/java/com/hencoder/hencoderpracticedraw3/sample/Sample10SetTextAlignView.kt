package com.hencoder.hencoderpracticedraw3.sample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Sample10SetTextAlignView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var text = "Hello HenCoder"

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        paint.textSize = 60f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        paint.textAlign = Paint.Align.LEFT
        canvas.drawText(text, (width / 2).toFloat(), 100f, paint)

        paint.textAlign = Paint.Align.CENTER
        canvas.drawText(text, (width / 2).toFloat(), 200f, paint)

        paint.textAlign = Paint.Align.RIGHT
        canvas.drawText(text, (width / 2).toFloat(), 300f, paint)
    }
}
