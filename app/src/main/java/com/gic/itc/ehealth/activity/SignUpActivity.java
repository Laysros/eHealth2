package com.gic.itc.ehealth.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.gic.itc.ehealth.MainActivity;
import com.gic.itc.ehealth.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by LAY Leangsros on 18/02/2016.
 */
public class SignUpActivity extends Activity {

    @OnClick(R.id.bNext)
    public void goNextStep(){
        startActivity(new Intent(SignUpActivity.this, MainActivity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);
        ButterKnife.bind(this);



    }
}