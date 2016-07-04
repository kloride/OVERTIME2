package com.kashim.seun.overtime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    String name;

    {
        name = "adminUser,Password";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void displayPassword (String name){
        String password = null;



        
    }Intent LoginIntent = new Intent(LoginActivity.this, WelcomeadminActivity.class);




}
