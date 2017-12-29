package com.hencoder.hencoderpracticedraw6.practice.practice08

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

import com.hencoder.hencoderpracticedraw6.Utils.dpToPixel

class Practice08ObjectAnimatorView : View {
    internal val radius = dpToPixel(80f)

    internal var arcRectF = RectF()
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    // TODO 为 progress 添加 getter 和 setter 方法（setter 方法记得加 invalidate()）
    internal var progress = 0f

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        paint.textSize = dpToPixel(40f)
        paint.textAlign = Paint.Align.CENTER
    }

    public override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val centerX = (width / 2).toFloat()
        val centerY = (height / 2).toFloat()

        paint.color = Color.parseColor("#E91E63")
        paint.style = Paint.Style.STROKE
        paint.strokeCap = Paint.Cap.ROUND
        paint.strokeWidth = dpToPixel(15f)
        arcRectF.set(centerX - radius, centerY - radius, centerX + radius, centerY + radius)
        canvas.drawArc(arcRectF, 135f, progress * 2.7f, false, paint)

        paint.color = Color.WHITE
        paint.style = Paint.Style.FILL
        canvas.drawText(progress.toInt().toString() + "%", centerX, centerY - (paint.ascent() + paint.descent()) / 2, paint)
    }
}
