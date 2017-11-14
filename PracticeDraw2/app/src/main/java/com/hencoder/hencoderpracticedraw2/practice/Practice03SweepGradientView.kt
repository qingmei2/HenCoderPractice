package com.hencoder.hencoderpracticedraw2.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color.parseColor
import android.graphics.Paint
import android.graphics.SweepGradient
import android.util.AttributeSet
import android.view.View

class Practice03SweepGradientView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        // 用 Paint.setShader(shader) 设置一个 SweepGradient
        // SweepGradient 的参数：圆心坐标：(300, 300)；颜色：#E91E63 到 #2196F3
        SweepGradient(300f, 300f, parseColor("#E91E63"), parseColor("#2196F3"))
                .also { paint.shader = it }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawCircle(300f, 300f, 200f, paint)
    }
}
