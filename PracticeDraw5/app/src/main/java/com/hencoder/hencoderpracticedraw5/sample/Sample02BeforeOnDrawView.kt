package com.hencoder.hencoderpracticedraw5.sample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet

class Sample02BeforeOnDrawView : AppCompatTextView {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var bounds = RectF()

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        paint.color = Color.parseColor("#FFC107")
    }

    override fun onDraw(canvas: Canvas) {
        val layout = layout
        bounds.left = layout.getLineLeft(1)
        bounds.right = layout.getLineRight(1)
        bounds.top = layout.getLineTop(1).toFloat()
        bounds.bottom = layout.getLineBottom(1).toFloat()
        canvas.drawRect(bounds, paint)
        bounds.left = layout.getLineLeft(layout.lineCount - 4)
        bounds.right = layout.getLineRight(layout.lineCount - 4)
        bounds.top = layout.getLineTop(layout.lineCount - 4).toFloat()
        bounds.bottom = layout.getLineBottom(layout.lineCount - 4).toFloat()
        canvas.drawRect(bounds, paint)

        super.onDraw(canvas)
    }
}
