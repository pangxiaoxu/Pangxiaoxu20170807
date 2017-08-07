package com.bawei.pangxiaoxu20170807;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //自定义标题
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置标题为某个布局
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.btactivity);

        
    }
}
