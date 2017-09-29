package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float centerX = getWidth() / 2;
        float centerY = getHeight() / 2;
        float radius = 300f;
        float distanceFocus = 20f;

        float left = centerX - radius;
        float top = centerY - radius;
        float right = centerX + radius;
        float bottom = centerY + radius;

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        paint.setColor(Color.RED);
        canvas.drawArc(left - distanceFocus, top - distanceFocus, right - distanceFocus, bottom - distanceFocus, -180f, 105f, true, paint);

        paint.setColor(Color.parseColor("#DA9D2A"));
        canvas.drawArc(left, top, right, bottom, -75f, 73f, true, paint);

        paint.setColor(Color.parseColor("#93076B"));
        canvas.drawArc(left, top, right, bottom, 0f, 9f, true, paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(left, top, right, bottom, 11f, 7f, true, paint);

        paint.setColor(Color.parseColor("#22BF93"));
        canvas.drawArc(left, top, right, bottom, 20f, 62f, true, paint);

        paint.setColor(Color.parseColor("#6479EC"));
        canvas.drawArc(left, top, right, bottom, 85f, 95f, true, paint);
    }

}
