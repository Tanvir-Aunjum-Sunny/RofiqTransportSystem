package com.example.tanvir.rafiqtransportservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.tanvir.rafiqtransportservice.activity.InsertData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void insertDataactivity(View view) {
        Intent intent = new Intent(this,InsertData.class);
        startActivity(intent);
    }
}
