package com.hencoder.hencoderpracticedraw5.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.LinearLayout

class Practice04DispatchDrawLayout : LinearLayout {
    internal var pattern = Pattern()

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
//        setWillNotDraw(false)
    }

    // 把 onDraw() 换成 dispatchDraw()，让绘制内容可以盖住子 View
    // 另外，在改完之后，上面的 setWillNotDraw(false) 也可以删了
    override fun dispatchDraw(canvas: Canvas) {
        super.dispatchDraw(canvas)

        pattern.draw(canvas)
    }

    inner class Pattern {

        internal var patternPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        internal var spots: Array<Spot?>

        constructor() {
            spots = arrayOfNulls(4)
            spots[0] = Spot(0.14f, 0.3f, 0.026f)
            spots[1] = Spot(0.59f, 0.25f, 0.067f)
            spots[2] = Spot(0.22f, 0.6f, 0.067f)
            spots[3] = Spot(0.52f, 0.78f, 0.083f)
        }

        constructor(spots: Array<Spot?>) {
            this.spots = spots
        }

        init {
            patternPaint.color = Color.parseColor("#A0E91E63")
        }

        fun draw(canvas: Canvas) {
            val repitition = Math.ceil((width.toFloat() / height).toDouble()).toInt()
            for (i in 0 until spots.size * repitition) {
                val spot = spots[i % spots.size]
                canvas.drawCircle((i / spots.size).toFloat() * height.toFloat() * PATTERN_RATIO + spot!!.relativeX * height, spot.relativeY * height, spot.relativeSize * height, patternPaint)
            }
        }

        inner class Spot constructor(val relativeX: Float, val relativeY: Float, val relativeSize: Float)

    }

    companion object {
        val PATTERN_RATIO = 5f / 6
    }
}
