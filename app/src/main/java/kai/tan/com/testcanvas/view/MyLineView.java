package kai.tan.com.testcanvas.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.jiongbull.jlog.JLog;

/**
 * Created by Administrator on 2016/4/23.
 */
public class MyLineView extends View{
    public MyLineView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //把整张画布绘制成白色
        canvas.drawColor(Color.BLACK);
        Paint paint = new Paint();

        paint.setAntiAlias(true);//去锯齿
        paint.setColor(Color.BLUE);//设置paint的颜色
        paint.setStyle(Paint.Style.STROKE);//设置paint的风格
        paint.setStrokeWidth(4);//设置画笔宽度
        //获取到view的宽度
        int viewWidth = this.getWidth();
        int viewHight = this.getHeight();
        JLog.d("viewWidth:" + viewWidth);
        JLog.d("viewHight:" + viewHight);
        RectF arc = new RectF(10, 10, 100, 100);
        canvas.drawArc(arc, 3, 86, true, paint);
    }
}
