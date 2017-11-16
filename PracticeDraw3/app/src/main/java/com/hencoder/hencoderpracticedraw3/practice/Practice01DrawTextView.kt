package com.hencoder.hencoderpracticedraw3.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice01DrawTextView : View {

    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    internal var text = "Hello HenCoder"

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        paint.textSize = 60f
    }

    public override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // 使用 drawText() 来绘制文字
        // 文字坐标： (50, 100)
    }
}
