package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StartUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup);
    }
    public void onButtonSUclick(View view){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
