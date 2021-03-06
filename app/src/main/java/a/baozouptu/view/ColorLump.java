package a.baozouptu.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/5/24.
 */
public class ColorLump extends View {
    private int mcolor;

    public ColorLump(Context context) {
        super(context);
    }

    public ColorLump(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /**
     * 设置颜色，同时重回绘图像
     * @param color
     */
    public void setColor(int color) {
        mcolor = color;
        invalidate();
    }

    public int getColor() {
        return mcolor;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(mcolor);
        super.onDraw(canvas);
    }
}
