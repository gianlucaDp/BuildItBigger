package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.gianlucadp.jokeandroidlib.JokeVisualizerActivity;


public class MainActivity extends AppCompatActivity{

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
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellRandomJoke(View view) {
        new AsyncTask().execute(this);

    }

    private class AsyncTask extends EndPointAsyncTask {

        @Override
        protected void onPostExecute(String result) {
            if (result!=null){
                Intent intent = new Intent(getContext(),JokeVisualizerActivity.class );
                intent.putExtra(JokeVisualizerActivity.JOKE_EXTRA_KEY, result);
                startActivityForResult(intent,100);
            }
        }
    }
}
