package com.dealacceleration.arvind.framework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import services.Factory;
import services.IService;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        createFactory();
    }

    public void createFactory() {
        // Create factory and pass it on to other activities.
        Factory factory = Factory.getInstance();
        IService first_activity = factory.getService("IRequestSvc", this);
        Log.d("Factory returned - ", first_activity.getServiceName());
    }

    public void onFirstClicked(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
