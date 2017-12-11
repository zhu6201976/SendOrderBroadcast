package com.example.administrator.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by My on 2017/12/11.
 */

public class CountryReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        setResultData("习大大给每位村民发了10斤大米");
        String resultData = getResultData();
        Toast.makeText(context, "country:" + resultData, Toast.LENGTH_SHORT).show();
    }
}
