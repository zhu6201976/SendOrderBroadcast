package com.example.administrator.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by My on 2017/12/11.
 */

public class ProvinceReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        setResultData("习大大给每位村民发了500斤大米");
        String resultData = getResultData();
        Toast.makeText(context, "province:" + resultData, Toast.LENGTH_SHORT).show();
    }
}
