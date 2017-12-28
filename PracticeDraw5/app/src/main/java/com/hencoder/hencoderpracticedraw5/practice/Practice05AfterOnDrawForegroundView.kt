package com.hencoder.hencoderpracticedraw5.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet

class Practice05AfterOnDrawForegroundView : AppCompatImageView {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        paint.textSize = 60f
    }

    override fun onDrawForeground(canvas: Canvas) {
        super.onDrawForeground(canvas)

        // 在 super.onDrawForeground() 的下方插入绘制代码，让绘制内容盖住前景
        // 由于这期的重点是绘制代码的位置而不是绘制代码本身，所以直接给出绘制代码，你只要解除注释就好
        paint.color = Color.parseColor("#f44336")
        canvas.drawRect(0f, 40f, 200f, 120f, paint)
        paint.color = Color.WHITE
        canvas.drawText("New", 20f, 100f, paint)
    }
}
