package com.dealacceleration.arvind.framework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import services.Factory;
import services.IService;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Factory fact = Factory.getInstance();
        IService service = fact.getService("IRequestSvc", this);
        Log.d("Second svc ", service.getServiceName());
    }
}
