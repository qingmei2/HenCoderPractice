package com.hencoder.hencoderpracticedraw2.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class Practice16TextPathView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var pathPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var textPath = Path()
    internal var text = "Hello HenCoder"

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        paint.textSize = 120f

        // 使用 Paint.getTextPath() 来获取文字的 Path
        paint.getTextPath(text,0,text.length,50f,600f,textPath)
        pathPaint.style = Paint.Style.STROKE
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawText(text, 50f, 200f, paint)

        canvas.drawPath(textPath, pathPaint)
    }
}
