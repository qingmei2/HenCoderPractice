package com.hencoder.hencoderpracticedraw4.sample

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Camera
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Point
import android.util.AttributeSet
import android.view.View

import com.hencoder.hencoderpracticedraw4.R

class Sample11CameraRotateView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var bitmap: Bitmap
    internal var point1 = Point(200, 100)
    internal var point2 = Point(600, 200)
    internal var camera = Camera()

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        bitmap = BitmapFactory.decodeResource(resources, R.drawable.maps)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.save()
        camera.save()
        camera.rotateX(30f)
        camera.applyToCanvas(canvas)
        camera.restore()
        canvas.drawBitmap(bitmap, point1.x.toFloat(), point1.y.toFloat(), paint)
        canvas.restore()

        canvas.save()
        camera.save()
        camera.rotateY(30f)
        camera.applyToCanvas(canvas)
        camera.restore()
        canvas.drawBitmap(bitmap, point2.x.toFloat(), point2.y.toFloat(), paint)
        canvas.restore()
    }
}
