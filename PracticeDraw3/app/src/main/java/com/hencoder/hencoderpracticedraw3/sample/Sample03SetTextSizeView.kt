package com.hencoder.hencoderpracticedraw3.sample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Sample03SetTextSizeView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var text = "Hello HenCoder"

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        var y = 100

        paint.textSize = 16f
        canvas.drawText(text, 50f, y.toFloat(), paint)

        y += 30
        paint.textSize = 24f
        canvas.drawText(text, 50f, y.toFloat(), paint)

        y += 55
        paint.textSize = 48f
        canvas.drawText(text, 50f, y.toFloat(), paint)

        y += 80
        paint.textSize = 72f
        canvas.drawText(text, 50f, y.toFloat(), paint)
    }
}
