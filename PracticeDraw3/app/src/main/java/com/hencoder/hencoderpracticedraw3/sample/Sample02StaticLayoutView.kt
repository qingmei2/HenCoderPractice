package com.hencoder.hencoderpracticedraw3.sample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.text.Layout
import android.text.StaticLayout
import android.text.TextPaint
import android.util.AttributeSet
import android.view.View

class Sample02StaticLayoutView : View {
    internal var textPaint = TextPaint(Paint.ANTI_ALIAS_FLAG)
    internal var text = "Hello\nHenCoder"
    internal var staticLayout: StaticLayout

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        textPaint.textSize = 60f
        // 这两行的位置不能换哟
        staticLayout = StaticLayout(text, textPaint, 600, Layout.Alignment.ALIGN_NORMAL, 1f, 0f, true)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.save()
        canvas.translate(50f, 40f)
        staticLayout.draw(canvas)
        canvas.restore()
    }
}
