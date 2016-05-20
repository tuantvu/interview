package com.usaa.interview.task;

import android.os.AsyncTask;

/**
 * Created by oj82730 on 5/20/16.
 */
public class LoginTask extends AsyncTask<Void, Void, Void> {
    @Override
    protected Void doInBackground(Void... params) {
        try {
            Thread.sleep(1500l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
