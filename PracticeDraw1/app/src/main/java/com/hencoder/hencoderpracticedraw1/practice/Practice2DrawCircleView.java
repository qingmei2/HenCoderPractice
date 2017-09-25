package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private int centerX;
    private int centerY;
    final private Paint blackPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    final private Paint bluePaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        //先划分好四个区域给四个圆
        centerX = getWidth() / 2;
        centerY = getHeight() / 2;

        //准备好2个需要的Paint
        blackPaint.setColor(Color.BLACK);
        bluePaint.setColor(Color.BLUE);

        //实心圆
        drawCircle1(canvas);
        //空心圆
        drawCircle2(canvas);
        //蓝色实心圆
        drawCircle3(canvas);
        //线宽为20的实心圆
        drawCircle4(canvas);
    }

    private void drawCircle1(Canvas canvas) {
        blackPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(centerX - 200f,
                centerY - 200f,
                180f,
                blackPaint);
    }

    private void drawCircle2(Canvas canvas) {
        blackPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(centerX + 200f,
                centerY - 200f,
                180f,
                blackPaint);
    }

    private void drawCircle3(Canvas canvas) {
        bluePaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(centerX - 200f,
                centerY + 200f,
                180f,
                bluePaint);
    }

    private void drawCircle4(Canvas canvas) {
        blackPaint.setStyle(Paint.Style.STROKE);
        blackPaint.setStrokeWidth(20);
        canvas.drawCircle(centerX + 200f,
                centerY + 200f,
                180f,
                blackPaint);
    }
}
