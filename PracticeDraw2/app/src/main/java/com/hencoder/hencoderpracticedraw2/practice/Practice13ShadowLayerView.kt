package com.hencoder.hencoderpracticedraw2.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice13ShadowLayerView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        // 使用 Paint.setShadowLayer() 设置阴影
        paint.setShadowLayer(10f,0f,0f, Color.RED)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        paint.textSize = 120f
        canvas.drawText("Hello HenCoder", 50f, 200f, paint)
    }
}
