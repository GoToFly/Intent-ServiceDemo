package com.horry.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService {
    /**
     * 默认无参构造函数
     */
    public MyIntentService() {
        super("MyIntentService");
    }

    public MyIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("MyIntentService", "开始处理耗时操作");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.d("MyIntentService", "耗时操作处理完成");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyIntentService", "Service自动停止");
    }
}
