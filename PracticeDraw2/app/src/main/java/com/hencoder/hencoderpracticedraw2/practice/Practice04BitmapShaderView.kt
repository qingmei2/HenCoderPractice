package com.hencoder.hencoderpracticedraw2.practice

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import com.hencoder.hencoderpracticedraw2.R

class Practice04BitmapShaderView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        // 用 Paint.setShader(shader) 设置一个 BitmapShader
        // Bitmap: R.drawable.batman
        BitmapFactory.decodeResource(resources, R.drawable.batman)
                .let { BitmapShader(it, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP) }
                .also { paint.shader = it }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawCircle(200f, 200f, 200f, paint)
    }
}
