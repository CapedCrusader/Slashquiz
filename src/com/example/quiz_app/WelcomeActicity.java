package com.example.quiz_app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class WelcomeActicity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_acticity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_welcome_acticity, menu);
        return true;
    }
}
