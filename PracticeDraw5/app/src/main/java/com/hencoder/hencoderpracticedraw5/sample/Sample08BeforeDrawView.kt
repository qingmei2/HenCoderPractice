package com.hencoder.hencoderpracticedraw5.sample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.support.v7.widget.AppCompatEditText
import android.util.AttributeSet

class Sample08BeforeDrawView : AppCompatEditText {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun draw(canvas: Canvas) {
        canvas.drawColor(Color.parseColor("#66BB6A")) // 涂上绿色

        super.draw(canvas)
    }
}
