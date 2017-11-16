package com.hencoder.hencoderpracticedraw3.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice10SetTextAlignView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var text = "Hello HenCoder"

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        paint.textSize = 60f

        // 使用 Paint.setTextAlign() 来调整文字对齐方式
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // 使用 Paint.setTextAlign() 来调整文字对齐方式

        // 第一处：使用 Paint.Align.LEFT
        canvas.drawText(text, (width / 2).toFloat(), 100f, paint)

        // 第二处：使用 Paint.Align.CENTER
        canvas.drawText(text, (width / 2).toFloat(), 200f, paint)

        // 第三处：使用 Paint.Align.RIGHT
        canvas.drawText(text, (width / 2).toFloat(), 300f, paint)
    }
}
