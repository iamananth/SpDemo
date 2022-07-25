package com.example.spdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onLogin(View v)
    {
        ed1 = (EditText) findViewById(R.id.et1);
        ed2 = (EditText) findViewById(R.id.et2);
        SharedPreferences sp;
        sp = getSharedPreferences("SD", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        ed.putString("un",ed1.getText().toString());
        ed.putString("up",ed2.getText().toString());
        ed.commit();
        Intent in = new Intent(this, Sec.class);
        startActivity(in);
    }
}