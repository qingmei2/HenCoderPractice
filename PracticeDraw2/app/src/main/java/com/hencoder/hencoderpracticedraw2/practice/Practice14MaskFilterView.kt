package com.hencoder.hencoderpracticedraw2.practice

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

import com.hencoder.hencoderpracticedraw2.R

class Practice14MaskFilterView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var bitmap: Bitmap
    private var blurMaskFilterNormal: BlurMaskFilter
    private var blurMaskFilterInner: BlurMaskFilter
    private var blurMaskFilterOuter: BlurMaskFilter
    private var blurMaskFilterSOLID: BlurMaskFilter


    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        setLayerType(View.LAYER_TYPE_SOFTWARE, null)
        bitmap = BitmapFactory.decodeResource(resources, R.drawable.what_the_fuck)
        blurMaskFilterNormal = BlurMaskFilter(50f, BlurMaskFilter.Blur.NORMAL)
        blurMaskFilterInner = BlurMaskFilter(50f,BlurMaskFilter.Blur.INNER)
        blurMaskFilterOuter = BlurMaskFilter(50f,BlurMaskFilter.Blur.OUTER)
        blurMaskFilterSOLID= BlurMaskFilter(50f,BlurMaskFilter.Blur.SOLID)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // 用 Paint.setMaskFilter 来设置不同的 BlurMaskFilter

        // 第一个：NORMAL
        paint.maskFilter = blurMaskFilterNormal
        canvas.drawBitmap(bitmap, 100f, 50f, paint)

        // 第二个：INNER
        paint.maskFilter = blurMaskFilterInner
        canvas.drawBitmap(bitmap, (bitmap.width + 200).toFloat(), 50f, paint)

        // 第三个：OUTER
        paint.maskFilter = blurMaskFilterOuter
        canvas.drawBitmap(bitmap, 100f, (bitmap.height + 100).toFloat(), paint)

        // 第四个：SOLID
        paint.maskFilter = blurMaskFilterSOLID
        canvas.drawBitmap(bitmap, (bitmap.width + 200).toFloat(), (bitmap.height + 100).toFloat(), paint)
    }
}
