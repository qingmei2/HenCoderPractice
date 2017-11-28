package com.hencoder.hencoderpracticedraw3.sample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.View

class Sample04SetTypefaceView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var text = "Hello HenCoder"
    internal var typeface: Typeface

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        paint.textSize = 60f

        typeface = Typeface.createFromAsset(context.assets, "Satisfy-Regular.ttf")
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        paint.typeface = null
        canvas.drawText(text, 50f, 100f, paint)
        paint.typeface = Typeface.SERIF
        canvas.drawText(text, 50f, 200f, paint)
        paint.typeface = typeface
        canvas.drawText(text, 50f, 300f, paint)
    }
}
