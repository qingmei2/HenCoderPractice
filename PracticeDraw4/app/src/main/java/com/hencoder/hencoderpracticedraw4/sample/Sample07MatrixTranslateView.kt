package com.hencoder.hencoderpracticedraw4.sample

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Point
import android.util.AttributeSet
import android.view.View

import com.hencoder.hencoderpracticedraw4.R

class Sample07MatrixTranslateView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var bitmap: Bitmap
    internal var point1 = Point(200, 200)
    internal var point2 = Point(600, 200)
    internal var matrix = Matrix()

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        bitmap = BitmapFactory.decodeResource(resources, R.drawable.maps)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.save()
        matrix.reset()
        matrix.postTranslate(-100f, -100f)
        canvas.concat(matrix)
        canvas.drawBitmap(bitmap, point1.x.toFloat(), point1.y.toFloat(), paint)
        canvas.restore()

        canvas.save()
        matrix.reset()
        matrix.postTranslate(200f, 0f)
        canvas.concat(matrix)
        canvas.drawBitmap(bitmap, point2.x.toFloat(), point2.y.toFloat(), paint)
        canvas.restore()
    }
}
