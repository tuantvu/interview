package com.usaa.interview;

import com.usaa.interview.task.LoginTask;

import java.util.Random;

/**
 * Created by oj82730 on 5/20/16.
 */
public class LoginService {
    Callback mCallback;

    public LoginService(Callback callback){
        mCallback = callback;
    }

    public void checkIfLoggedIn(){
        new LoginTask(){
            @Override
            protected void onPostExecute(Void aVoid) {
                Random random = new Random();
                if (random.nextBoolean()) {
                    mCallback.onCheckLoggedInSuccessful();
                }
                else
                {
                    mCallback.onCheckLoggedInFailed();
                }
            }
        }.execute();
    }

    public void login(String email){
        new LoginTask(){
            @Override
            protected void onPostExecute(Void aVoid) {
                Random random = new Random();
                if (random.nextBoolean()) {
                    mCallback.onLoginSuccessful();
                }
                else
                {
                    mCallback.onLoginFailed();
                }
            }
        }.execute();
    }

    public static interface Callback{
        void onCheckLoggedInSuccessful();
        void onCheckLoggedInFailed();
        void onLoginSuccessful();
        void onLoginFailed();
    }
}
