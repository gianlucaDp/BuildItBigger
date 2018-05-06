package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.gianlucadp.jokeandroidlib.JokeVisualizerActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellRandomJoke(View view) {
        new JokeAsyncTask(this).execute();

    }

    private class JokeAsyncTask extends EndPointAsyncTask {
        private Context currentContext;

        public JokeAsyncTask(Context context) {
            this.currentContext = context;
        }

        @Override
        protected void onPostExecute(String result) {
            if (result != null) {
                Intent intent = new Intent(currentContext, JokeVisualizerActivity.class);
                intent.putExtra(JokeVisualizerActivity.JOKE_EXTRA_KEY, result);
                startActivityForResult(intent, 100);
            }
        }
    }
}
