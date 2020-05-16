package com.ywl5320.openslesrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public native void startRecord(String path);

    public native void stopRecord();

    public void start(View view) {
        startRecord(Environment.getExternalStorageDirectory().getAbsolutePath() + "/wl_opensl_record.pcm");
    }

    public void stop(View view) {
        stopRecord();
    }
}
