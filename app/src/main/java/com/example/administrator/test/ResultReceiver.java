package com.example.administrator.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * ResultReceiver
 * 无需清单文件注册
 * Created by My on 2017/12/11.
 */

public class ResultReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String resultData = getResultData();
        Toast.makeText(context, "ResultReceiver:报告习大大:" + resultData, Toast.LENGTH_SHORT).show();
    }
}
