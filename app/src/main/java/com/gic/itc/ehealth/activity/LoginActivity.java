package com.gic.itc.ehealth.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.gic.itc.ehealth.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by LAY Leangsros on 18/02/2016.
 */
public class LoginActivity extends Activity {



    @Bind(R.id.bSignin)
    Button mSignin;
    @OnClick(R.id.bCreateNewAcc)
    public void createNewAcc(){
        startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        ButterKnife.bind(this);


    }
}
