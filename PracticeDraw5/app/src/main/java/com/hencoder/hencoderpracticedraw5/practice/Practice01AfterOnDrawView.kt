package com.hencoder.hencoderpracticedraw5.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import com.hencoder.hencoderpracticedraw5.R

class Practice01AfterOnDrawView : AppCompatImageView {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        paint.color = Color.parseColor("#FFC107")
        paint.textSize = 28f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // 在 super.onDraw() 的下方插入绘制代码，让绘制内容盖住原主体内容
        // 由于这期的重点是绘制代码的位置而不是绘制代码本身，所以直接给出绘制代码，你只要解除注释就好
        // 爽吧？

        canvas.apply {
            save()
            concat(imageMatrix)
            drawText(resources.getString(R.string.image_size, drawable.bounds.width(), drawable.bounds.height()), 20f, 40f, paint)
            restore()
        }
    }
}