package com.hencoder.hencoderpracticedraw2.practice

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class Practice12PathEffectView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var path = Path()

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        paint.style = Paint.Style.STROKE

        path.moveTo(50f, 100f)
        path.rLineTo(50f, 100f)
        path.rLineTo(80f, -150f)
        path.rLineTo(100f, 100f)
        path.rLineTo(70f, -120f)
        path.rLineTo(150f, 80f)
    }

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // 使用 Paint.setPathEffect() 来设置不同的 PathEffect

        // 第一处：CornerPathEffect
        // 参数 radius 是圆角的半径
        CornerPathEffect(20f).also { paint.pathEffect = it }
        canvas.drawPath(path, paint)
        canvas.save()
        canvas.translate(500f, 0f)

        // 第二处：DiscretePathEffect
        DiscretePathEffect(5f, 2f).let { paint.pathEffect = it }
        canvas.drawPath(path, paint)
        canvas.restore()
        canvas.save()
        canvas.translate(0f, 200f)

        // 第三处：DashPathEffect
        DashPathEffect(floatArrayOf(20f, 10f, 5f, 10f), 0f).also { paint.pathEffect = it }
        canvas.drawPath(path, paint)
        canvas.restore()
        canvas.save()
        canvas.translate(500f, 200f)

        // 第四处：PathDashPathEffect
        Path().also { it.lineTo(20f, -30f) }
                .also { it.lineTo(-10f, 0f) }
                .also { it.close() }
                .let { PathDashPathEffect(it, 40f, 0f, PathDashPathEffect.Style.TRANSLATE) }
                .let { paint.pathEffect = it }
        canvas.drawPath(path, paint)
        canvas.restore()
        canvas.save()
        canvas.translate(0f, 400f)

        // 第五处：SumPathEffect
        val dashPathEffect = DashPathEffect(floatArrayOf(20f, 10f, 5f, 10f), 0f)
        val discretePathEffect = DiscretePathEffect(5f, 2f)
        val sumPathEffect = SumPathEffect(dashPathEffect, discretePathEffect)
        paint.pathEffect = sumPathEffect
        canvas.drawPath(path, paint)
        canvas.restore()
        canvas.save()
        canvas.translate(500f, 400f)

        // 第六处：ComposePathEffect
        val compose = ComposePathEffect(dashPathEffect, discretePathEffect)
        paint.pathEffect = compose

        canvas.drawPath(path, paint)
        canvas.restore()
    }
}
