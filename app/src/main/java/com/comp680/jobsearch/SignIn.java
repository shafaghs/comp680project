package com.comp680.jobsearch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by shafagh-moji on 2/13/2017.
 */

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        if(getSupportActionBar() != null){
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }


}
