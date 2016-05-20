package com.usaa.interview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class Challenge2Activity extends AppCompatActivity {

    View progressBar;

    private final static String HEADLESS_FRAGMENT = "headlessFragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge2);
        progressBar = findViewById(R.id.progressBar);
    }

    @Override
    protected void onStart() {
        super.onStart();
        showProgressBar();

        /**
         * TODO: check if logged in. If not, show the log in, else, show the welcome
         *
         */
    }

    /**
     * TODO ADD ADDITIONAL CODE HERE
     */


    private void showProgressBar()
    {
        progressBar.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar()
    {
        progressBar.setVisibility(View.GONE);
    }





    private HeadlessFragment getHeadlessFragment(){
        FragmentManager fm = getSupportFragmentManager();
        HeadlessFragment headlessFragment = (HeadlessFragment)fm.findFragmentByTag(HEADLESS_FRAGMENT);
        if (headlessFragment == null){
            headlessFragment = new HeadlessFragment();
            fm.beginTransaction().add(headlessFragment, HEADLESS_FRAGMENT).commit();
        }
        return headlessFragment;
    }


}
