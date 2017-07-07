package com.example.intel.combustible;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Button mBtLaunchActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            mBtLaunchActivity = (Button) findViewById(R.id.button2);

            mBtLaunchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    launchActivity();
                }
            });

    }




        private void launchActivity() {

            Intent intent = new Intent(this, filtro.class);
            startActivity(intent);
        }


    }

