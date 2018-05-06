package com.udacity.gradle.buildItBigger;

import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndPointAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {
    private CountDownLatch signal;
    @Test
    public void testJokeIsRetrieved() throws InterruptedException {
        signal = new CountDownLatch(1);
        new TestAsyncTask().execute();
        signal.await();
    }

    private class TestAsyncTask extends EndPointAsyncTask {

        @Override
        protected void onPostExecute(String result) {
            assertNotNull("The joke string is null", result);
            if (result != null) {
                assertTrue("The joke string is empty", !result.isEmpty());
            }
            signal.countDown();
        }
    }
}