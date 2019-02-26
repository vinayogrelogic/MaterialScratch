package com.egnize.scratchview.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * Created by VINAY on 21/11/18
 */

public class ScratchScrollView extends ScrollView {
  public ScratchScrollView(Context context) {
    super(context);
  }

  public ScratchScrollView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public ScratchScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  public boolean onInterceptTouchEvent(MotionEvent ev) {
    return false;
  }
}
