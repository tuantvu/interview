package com.usaa.interview;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by oj82730 on 5/20/16.
 */
public class HeadlessFragment extends Fragment implements LoginService.Callback{

    Callback mCallback;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Callback) {
            mCallback = (Callback) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement HeadlessFragment.Callback");
        }
    }

    public void checkIfLoggedIn(){
        LoginService service = new LoginService(this);
        service.checkIfLoggedIn();
    }

    public void login(String email){
        LoginService service = new LoginService(this);
        service.login(email);
    }

    @Override
    public void onCheckLoggedInSuccessful() {
        mCallback.onCheckLoggedInSuccessful();
    }

    @Override
    public void onCheckLoggedInFailed() {
        mCallback.onCheckLoggedInFailed();
    }

    @Override
    public void onLoginSuccessful() {
        mCallback.onLoginSuccessful();
    }

    @Override
    public void onLoginFailed() {
        mCallback.onLoginFailed();
    }

    public static interface Callback{
        void onCheckLoggedInSuccessful();
        void onCheckLoggedInFailed();
        void onLoginSuccessful();
        void onLoginFailed();
    }
}
