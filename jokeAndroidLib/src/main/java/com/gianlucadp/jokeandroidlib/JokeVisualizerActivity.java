package com.gianlucadp.jokeandroidlib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;

public class JokeVisualizerActivity extends AppCompatActivity {
    public final static String JOKE_EXTRA_KEY = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.joke_vistualizer_activity);
        if (getIntent().hasExtra(JOKE_EXTRA_KEY)) {
            TextView joke = findViewById(R.id.tv_joke);
            try {
                joke.setText(new String(getIntent().getStringExtra(JOKE_EXTRA_KEY).getBytes(), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onBackPressed() {
        returnToCaller();
        //super.onBackPressed(); Not needed
    }

    private void returnToCaller() {
        Intent intent = new Intent();
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

}
