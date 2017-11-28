package com.hencoder.hencoderpracticedraw3.sample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

class Sample13GetTextBoundsView : View {
    internal var paint1 = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var paint2 = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var texts = arrayOf("A", "a", "J", "j", "Â", "â")
    internal var yOffsets = intArrayOf(0, 0, 0, 0, 0, 0)
    internal var top = 200
    internal var bottom = 400

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        paint1.style = Paint.Style.STROKE
        paint1.strokeWidth = 20f
        paint1.color = Color.parseColor("#E91E63")
        paint2.textSize = 160f

        val textBounds = Rect()
        paint2.getTextBounds(texts[0], 0, texts[0].length, textBounds)
        yOffsets[0] = -(textBounds.top + textBounds.bottom) / 2
        paint2.getTextBounds(texts[1], 0, texts[1].length, textBounds)
        yOffsets[1] = -(textBounds.top + textBounds.bottom) / 2
        paint2.getTextBounds(texts[2], 0, texts[2].length, textBounds)
        yOffsets[2] = -(textBounds.top + textBounds.bottom) / 2
        paint2.getTextBounds(texts[3], 0, texts[3].length, textBounds)
        yOffsets[3] = -(textBounds.top + textBounds.bottom) / 2
        paint2.getTextBounds(texts[4], 0, texts[4].length, textBounds)
        yOffsets[4] = -(textBounds.top + textBounds.bottom) / 2
        paint2.getTextBounds(texts[5], 0, texts[5].length, textBounds)
        yOffsets[5] = -(textBounds.top + textBounds.bottom) / 2
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawRect(50f, top.toFloat(), (width - 50).toFloat(), bottom.toFloat(), paint1)

        val middle = (top + bottom) / 2
        canvas.drawText(texts[0], 100f, (middle + yOffsets[0]).toFloat(), paint2)
        canvas.drawText(texts[1], 200f, (middle + yOffsets[1]).toFloat(), paint2)
        canvas.drawText(texts[2], 300f, (middle + yOffsets[2]).toFloat(), paint2)
        canvas.drawText(texts[3], 400f, (middle + yOffsets[3]).toFloat(), paint2)
        canvas.drawText(texts[4], 500f, (middle + yOffsets[4]).toFloat(), paint2)
        canvas.drawText(texts[5], 600f, (middle + yOffsets[5]).toFloat(), paint2)
    }
}
