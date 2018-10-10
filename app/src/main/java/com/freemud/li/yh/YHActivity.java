package com.freemud.li.yh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;

import com.freemud.li.clearance.R;
import com.freemud.li.constant.Constant;

public class YHActivity extends Activity {
    private int mLevel;
    private int bgNum;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.main);
        mLevel = Constant.MLevel;
        SurfaceView v = new SurfaceView(this);
        HolderSurfaceView.getInstance().setSurfaceView(v);
        if(mLevel==15){
            bgNum = R.drawable.bg;
        }else if(mLevel ==25){
            bgNum = R.drawable.bg;
        }else if(mLevel ==35){
            bgNum = R.drawable.bg;
        }

        v.setBackgroundResource(bgNum);
        this.setContentView(v);
        DrawYH yh = new DrawYH();
        v.setOnTouchListener(yh);
        yh.begin();
//		DrawText text=new DrawText();
//		text.begin();
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, YHActivity.class);
        context.startActivity(intent);
    }

}