package com.hencoder.hencoderpracticedraw3.sample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Sample14GetFontMetricsView : View {
    internal var paint1 = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var paint2 = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var texts = arrayOf("A", "a", "J", "j", "Â", "â")
    internal var yOffset: Float = 0.toFloat()
    internal var top = 200
    internal var bottom = 400

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        paint1.style = Paint.Style.STROKE
        paint1.strokeWidth = 20f
        paint1.color = Color.parseColor("#E91E63")
        paint2.textSize = 160f

        val fontMetrics = paint2.fontMetrics
        yOffset = -(fontMetrics.ascent + fontMetrics.descent) / 2
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawRect(50f, top.toFloat(), (width - 50).toFloat(), bottom.toFloat(), paint1)

        val middle = (top + bottom) / 2
        canvas.drawText(texts[0], 100f, middle + yOffset, paint2)
        canvas.drawText(texts[1], 200f, middle + yOffset, paint2)
        canvas.drawText(texts[2], 300f, middle + yOffset, paint2)
        canvas.drawText(texts[3], 400f, middle + yOffset, paint2)
        canvas.drawText(texts[4], 500f, middle + yOffset, paint2)
        canvas.drawText(texts[5], 600f, middle + yOffset, paint2)
    }
}
