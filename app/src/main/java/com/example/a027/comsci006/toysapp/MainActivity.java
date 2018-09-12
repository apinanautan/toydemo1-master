package com.example.a027.comsci006.toysapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ของเล่นเด็กออทิสติก = (Button)findViewById(R.id.buttontoy);
        ของเล่นเด็กออทิสติก.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Video_activity.class);
                startActivity(i);
            }
        });

    }
}
