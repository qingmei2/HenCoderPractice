package com.hencoder.hencoderpracticedraw4.practice

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

import com.hencoder.hencoderpracticedraw4.R

class Practice12CameraRotateFixedView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var bitmap: Bitmap
    internal var point1 = Point(200, 200)
    internal var point2 = Point(600, 200)
    internal var camera = Camera()
    internal var matrix = Matrix()

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int)
            : super(context, attrs, defStyleAttr)

    init {
        bitmap = BitmapFactory.decodeResource(resources, R.drawable.maps)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var w = bitmap.width.toFloat()
        var h = bitmap.height.toFloat()

        canvas.save()
        matrix.reset()
        camera.save()
        camera.rotateX(30f)
        camera.getMatrix(matrix)
        camera.restore()
        matrix.preTranslate(-(point1.x + w / 2), -(point1.y + h / 2))
        matrix.postTranslate((point1.x + w / 2), (point1.y + h / 2))
        canvas.concat(matrix)
        canvas.drawBitmap(bitmap, point1.x.toFloat(), point1.y.toFloat(), paint)
        canvas.restore()

        canvas.save()
        matrix.reset()
        camera.save()
        camera.rotateY(30f)
        camera.getMatrix(matrix)
        camera.restore()
        matrix.preTranslate(-(point2.x + w / 2), -(point2.y + h / 2))
        matrix.postTranslate((point2.x + w / 2), (point2.y + h / 2))
        canvas.concat(matrix)
        canvas.drawBitmap(bitmap, point2.x.toFloat(), point2.y.toFloat(), paint)
        canvas.restore()
    }
}
