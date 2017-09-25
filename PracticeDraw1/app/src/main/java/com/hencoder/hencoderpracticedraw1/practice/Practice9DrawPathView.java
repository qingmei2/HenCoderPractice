package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    final private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    private Path path = new Path();

    private RectF rectLeft = new RectF();
    private RectF rectRight = new RectF();

    private float centerX = 400f;       //心形的中线横坐标值
    private float centerTop = 200f;       //心形的中线top
    private float centerBottom = 540f;       //心形的中线bottom

    private float radius = 100f;        //心形圆弧的半径

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        //心形左边圆弧
        rectLeft.set(centerX - 2 * radius, centerTop, centerX, centerTop + 2 * radius);
        rectRight.set(centerX, centerTop, centerX + 2 * radius, centerTop + 2 * radius);

        path.addArc(rectLeft, -225, 225);   //-225° 到 0°
        path.arcTo(rectRight, -180, 225, false); //从-180°到45°
        path.lineTo(centerX, centerBottom);

        canvas.drawPath(path, paint);
    }
}
