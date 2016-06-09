package com.application.chetna_priya.displayjokes;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.example.chetna_priya.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

/**
 * Created by chetna_priya on 6/7/2016.
 */
public class EndpointsAsyncTask extends AsyncTask<Context, Void, String> {

    private static MyApi myApiService;
    private Context context;
    private static final String JOKE = "joke";
    EndpointstaskListener mEndpointstaskListener;
    private Exception mError = null;

    public interface EndpointstaskListener {
        public void onComplete(String result, Exception e);
    }

    @Override
    protected String doInBackground(Context... params) {
        if(myApiService == null)
        {
            /*
           MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(),null)
                    .setRootUrl("http://10.0.2.2:8080/_ap/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> request) throws IOException {
                            request.setDisableGZipContent(true);
                        }
                    });*/

            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://builditbigger-1335.appspot.com/_ah/api/");

            myApiService = builder.build();
            context = params[0];
        }
        try {
            return myApiService.fetchJokes().execute().getData();
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    public EndpointsAsyncTask setListener(EndpointstaskListener listener) {
        this.mEndpointstaskListener = listener;
        return this;
    }



    @Override
    protected void onPostExecute(String result) {
        if(this.mEndpointstaskListener!=null){
            mEndpointstaskListener.onComplete(result,null);
        }
    }

    @Override
    protected void onCancelled(String s) {
        if(this.mEndpointstaskListener!=null){
            mError = new Exception("Async Task Canelled");
            mEndpointstaskListener.onComplete(null,mError);
        }
        super.onCancelled(s);
    }

}
