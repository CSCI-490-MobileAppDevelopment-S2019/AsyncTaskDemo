package com.stingersof.asynctaskdemo;

import android.os.AsyncTask;
import android.widget.TextView;

import java.util.Random;


/**
 * Created by kbriggs on 3/6/18.
 */

public class MyAsyncTask extends AsyncTask<Void, Void, String> {

    private TextView textView;

    public MyAsyncTask(TextView textView) {
        this.textView = textView;
    }

    @Override
    protected String doInBackground(Void... voids) {
        Random rand = new Random();
        int  n = rand.nextInt(5000) + 1;
        try {
            Thread.sleep(n);

        } catch (Exception ex) {

        }
        return String.valueOf(n);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        textView.setText("I slept for " + s + "milliseconds");
    }
}
