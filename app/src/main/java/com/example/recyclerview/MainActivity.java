package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mWordList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        for (int i = 0; i < 20; i++) {
            mWordList.addLast("Word " + i);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}