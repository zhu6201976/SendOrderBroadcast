package com.example.administrator.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * 习大大发大米
 * 发送一条自定义有序广播
 * 自己应用创建广播接收者接收
 * <intent-filter android:priority="1000">
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // 点击按钮,发送一条自定义有序广播
    public void sendBroadcast(View view) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.XIDADA_SEND_RICE");
        sendOrderedBroadcast(intent, null, new ResultReceiver(), null, 0, "习大大给每位村民发了1000斤大米", null);
    }

}
