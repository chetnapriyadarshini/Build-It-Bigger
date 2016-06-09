package com.application.chetna_priya.displayjokes;

import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainDisplayActivity extends AppCompatActivity {

    private static final String JOKE = "joke";
    private static final String LOG_TAG = MainDisplayActivity.class.getSimpleName();
    private static String joke;

    TextView jokeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_main);
        /*joke = getIntent().getStringExtra(JOKE);*/
        jokeView = (TextView) findViewById(R.id.tv_joke);
        final ContentLoadingProgressBar progressBar = (ContentLoadingProgressBar) findViewById(R.id.progress_bar);
        progressBar.show();
        if(progressBar == null)
            Log.d(LOG_TAG, "Progress bar nullllllllllllll");
        progressBar.setVisibility(View.VISIBLE);
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.setListener(new EndpointsAsyncTask.EndpointstaskListener() {
            @Override
            public void onComplete(String result, Exception e) {
                progressBar.hide();
                findViewById(R.id.tv_loading_joke).setVisibility(View.GONE);
               // progressBar.setVisibility(View.GONE);
                jokeView.setText(result);
            }
        }).execute(this);
       // jokeView.setText(joke);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(JOKE, joke);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState != null && savedInstanceState.containsKey(JOKE)){
            joke = savedInstanceState.getString(JOKE);
        }
    }
}
