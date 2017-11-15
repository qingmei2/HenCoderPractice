package com.hencoder.hencoderpracticedraw2.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class Practice10StrokeJoinView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var path = Path()

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        paint.strokeWidth = 40f
        paint.style = Paint.Style.STROKE

        path.rLineTo(200f, 0f)
        path.rLineTo(-160f, 120f)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.save()

        // 使用 Paint.setStrokeJoin() 来设置不同的拐角形状
        canvas.translate(100f, 100f)
        // 第一种形状：MITER
        paint.strokeJoin = Paint.Join.MITER
        canvas.drawPath(path, paint)

        canvas.translate(300f, 0f)
        // 第二种形状：BEVEL
        paint.strokeJoin = Paint.Join.BEVEL
        canvas.drawPath(path, paint)

        canvas.translate(300f, 0f)
        // 第三种形状：ROUND
        paint.strokeJoin = Paint.Join.ROUND
        canvas.drawPath(path, paint)

        canvas.restore()
    }
}
