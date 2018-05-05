package com.udacity.gradle.buildItBigger;

import android.app.Application;
import android.content.Intent;
import android.test.AndroidTestCase;
import android.test.ApplicationTestCase;
import com.udacity.gradle.builditbigger.EndPointAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class AsyncTaskTest extends AndroidTestCase {

    public void testJokeIsRetrieved() {
        new TestAsyncTask().execute();
    }

    private class TestAsyncTask extends EndPointAsyncTask {

        @Override
        protected void onPostExecute(String result) {
            assertNotNull("The joke string is null", result);
            if (result!=null){
                assertTrue("The joke string is empty", !result.isEmpty());
            }
        }
    }
}
