package com.fecmobile.distribution.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.RadioButton;

/**
 * @author tome
 * @date 2018/7/24  13:50
 * @describe ${drawableLeft与文本一起居中显示}
 */
public class CenterButton extends RadioButton{

    public CenterButton(Context context) {
        super(context);
    }

    public CenterButton(Context context,AttributeSet attrs) {
        super(context,attrs);
    }

    public CenterButton(Context context,AttributeSet attrs,int defStyleAttr) {
        super(context,attrs,defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //获取设置的图片
        Drawable[] drawables = getCompoundDrawables();
        if (drawables != null) {
            //第一个是left
            Drawable drawableRight = drawables[0];
            if (drawableRight != null) {
                //获取文字的宽度
                float textWidth = getPaint().measureText(getText().toString());
                //获取设置的DrawablePadding值
                int drawablePadding = getCompoundDrawablePadding();
                int drawableWidth = 0;
                //获取图片实际宽度
                drawableWidth = drawableRight.getIntrinsicWidth();
                float bodyWidth = textWidth + drawableWidth + drawablePadding;
                int y = getWidth();
                canvas.translate((getWidth() - bodyWidth) / 2, 0);
            }
        }
        super.onDraw(canvas);
    }
}
