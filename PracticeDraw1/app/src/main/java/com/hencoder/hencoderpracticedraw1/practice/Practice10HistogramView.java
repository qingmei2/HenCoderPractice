package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    final private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private float width;
    private float height;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        width = (float) getWidth();
        height = (float) getHeight();

        float centerX = width / 6;
        float centerY = height / 6 * 5;

        paint.setColor(Color.WHITE);
        canvas.drawLine(centerX, centerY, centerX, centerY - 500f, paint);
        canvas.drawLine(centerX, centerY, centerX + 800f, centerY, paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(centerX + 10, centerY -5, centerX + 90, centerY, paint);
        canvas.drawRect(centerX + 110, centerY - 20, centerX + 190, centerY, paint);
        canvas.drawRect(centerX + 210, centerY - 20, centerX + 290, centerY, paint);
        canvas.drawRect(centerX + 310, centerY - 100, centerX + 390, centerY, paint);
        canvas.drawRect(centerX + 410, centerY - 200, centerX + 490, centerY, paint);
        canvas.drawRect(centerX + 510, centerY - 290, centerX + 590, centerY, paint);
        canvas.drawRect(centerX + 610, centerY - 150, centerX + 690, centerY, paint);
    }
}
