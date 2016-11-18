package com.example.android.sunshine1.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            ForecastFragment forecastFragment = new ForecastFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.activity_main, forecastFragment)
                    .commit();
        }
        setContentView(R.layout.activity_main);
    }

}
