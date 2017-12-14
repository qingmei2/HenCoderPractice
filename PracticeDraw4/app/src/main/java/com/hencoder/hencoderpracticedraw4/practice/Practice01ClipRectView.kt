package com.hencoder.hencoderpracticedraw4.practice

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

import com.hencoder.hencoderpracticedraw4.R

class Practice01ClipRectView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var bitmap: Bitmap

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        bitmap = BitmapFactory.decodeResource(resources, R.drawable.maps)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)


        val left = (width - bitmap.width) / 2
        val top = (height - bitmap.height) / 2
        canvas.save()
        canvas.clipRect(Rect(left + 50, top + 50, left + bitmap.width - 50, top + bitmap.height - 50))
        canvas.drawBitmap(bitmap, left.toFloat(), top.toFloat(), paint)
        canvas.restore()
    }
}
