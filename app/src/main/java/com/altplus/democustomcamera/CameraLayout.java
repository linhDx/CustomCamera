package com.altplus.democustomcamera;

import android.content.Context;
import android.widget.FrameLayout;

/**
 * Created by Do Xuan Linh on 7/25/2016.
 */
public class CameraLayout extends FrameLayout {
    public CameraLayout(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
