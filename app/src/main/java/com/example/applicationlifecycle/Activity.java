package com.example.applicationlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Activity extends AppCompatActivity {

    private static final String TAG = "Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate Activity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate Activity");
    }

    @Override
    protected void onStart() {
        Toast.makeText(this, "onStart Activity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart Activity");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Toast.makeText(this, "onResume Activity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume Activity");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast.makeText(this, "onPause Activity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause Activity");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "onStop Activity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop Activity");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(this, "onRestart Activity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart Activity");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this, "onDestroy Activity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy Activity");
        super.onDestroy();
    }

    public void gotoActivity2(View view){}
    Intent intent = new Intent(this, Activity2.class);

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }
}