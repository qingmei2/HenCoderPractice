package com.hencoder.hencoderpracticedraw2.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color.parseColor
import android.graphics.Paint
import android.graphics.RadialGradient
import android.graphics.Shader
import android.util.AttributeSet
import android.view.View

class Practice02RadialGradientView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        // 用 Paint.setShader(shader) 设置一个 RadialGradient
        // RadialGradient 的参数：圆心坐标：(300, 300)；半径：200；颜色：#E91E63 到 #2196F3
        RadialGradient(300f, 300f, 200f, parseColor("#E91E63"), parseColor("#2196F3"), Shader.TileMode.CLAMP)
                .also { paint.shader = it }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawCircle(300f, 300f, 200f, paint)
    }
}
