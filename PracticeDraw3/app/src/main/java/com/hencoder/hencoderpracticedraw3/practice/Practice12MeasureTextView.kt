package com.hencoder.hencoderpracticedraw3.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice12MeasureTextView : View {
    internal var paint1 = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var paint2 = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var text1 = "三个月内你胖了"
    internal var text2 = "4.5"
    internal var text3 = "公斤"

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        paint1.textSize = 60f
        paint2.textSize = 120f
        paint2.color = Color.parseColor("#E91E63")
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // 使用 Paint.measureText 测量出文字宽度，让文字可以相邻绘制

        val length1 = paint1.measureText(text1, 0, text1.length)
        val length2 = paint2.measureText(text2, 0, text2.length)

        canvas.drawText(text1, 50f, 200f, paint1)
        canvas.drawText(text2, 50f + length1, 200f, paint2)
        canvas.drawText(text3, 50f + length1 + length2, 200f, paint1)
    }
}
