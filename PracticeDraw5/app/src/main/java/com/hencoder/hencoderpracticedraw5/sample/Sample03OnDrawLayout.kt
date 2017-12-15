package com.hencoder.hencoderpracticedraw5.sample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.LinearLayout

class Sample03OnDrawLayout : LinearLayout {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var pattern = Pattern()

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        // ViewGroup 需要主动开启 dispatchDraw() 以外的绘制
        setWillNotDraw(false)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        pattern.draw(canvas)
    }

    inner class Pattern {

        internal var patternPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        internal var spots: Array<Sample03OnDrawLayout.Spot?>

        constructor() {
            spots = arrayOfNulls(4)
            spots[0] = Sample03OnDrawLayout.Spot(0.24f, 0.3f, 0.026f)
            spots[1] = Sample03OnDrawLayout.Spot(0.69f, 0.25f, 0.067f)
            spots[2] = Sample03OnDrawLayout.Spot(0.32f, 0.6f, 0.067f)
            spots[3] = Sample03OnDrawLayout.Spot(0.62f, 0.78f, 0.083f)
        }

        constructor(spots: Array<Sample03OnDrawLayout.Spot?>) {
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
    }

    class Spot constructor(val relativeX: Float,  val relativeY: Float,  val relativeSize: Float)

    companion object {
        val PATTERN_RATIO = 5f / 6
    }
}
