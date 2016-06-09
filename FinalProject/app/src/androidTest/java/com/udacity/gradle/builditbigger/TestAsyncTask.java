package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import com.application.chetna_priya.displayjokes.EndpointsAsyncTask;

import java.util.concurrent.CountDownLatch;

/**
 * Created by chetna_priya on 6/7/2016.
 */
public class TestAsyncTask extends AndroidTestCase {

    CountDownLatch signal;
    String mResult = null;
    Exception mError =null;

    @Override
    protected void setUp() throws Exception {
        signal = new CountDownLatch(1);
    }

    @Override
    protected void tearDown() throws Exception {
        signal.countDown();
    }

    public void testTask() throws Exception
    {
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();
        asyncTask.setListener(new EndpointsAsyncTask.EndpointstaskListener() {
            @Override
            public void onComplete(String result, Exception e){
                mResult = result;
                mError = e;
                signal.countDown();
            }
        }).execute(getContext());
        signal.await();
        assertNull(mError);
        assertNotNull(mResult);
    }
}
