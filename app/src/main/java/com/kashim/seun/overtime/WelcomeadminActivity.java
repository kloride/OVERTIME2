package com.kashim.seun.overtime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by USER on 6/27/2016.
 */

public class WelcomeadminActivity extends AppCompatActivity {

    String name;
    Long phoneNumber;
    {
        name = "username,position,dept,selectuserid,overtime,task";
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomeadmin);
    }



    public void selectuserid(String name){


    }Intent LoginIntent = new Intent(WelcomeadminActivity.this, LoginActivity.class);

    private void displayselectuserid(){

        Button selectuseridButton = (Button) findViewById(R.id.Button_Select_User_id);
        selectuseridButton.setText("" + selectuseridButton);

    }

    private void displayUsername(){
        TextView UsernameText =(TextView)findViewById(R.id.Text_View_User_Name);
        UsernameText.setVisibility(View.VISIBLE);
    }

    private void displayPhoneNumber(){
        TextView PhoneNumberText =(TextView)findViewById(R.id.Text_View_Phone_Number);
        PhoneNumberText.setVisibility(View.VISIBLE);
    }
    private void displayDept(){
        TextView DeptText =(TextView)findViewById(R.id.Text_View_Dept);
        DeptText.setVisibility(View.VISIBLE);
    }
    private void displayPosition(){
        TextView PositionText = (TextView)findViewById(R.id.Text_View_Position);
        PositionText.setVisibility(View.VISIBLE);
    }
       private void displayOverButton (){
           Button OvertimeButton = (Button) findViewById(R.id.Button_Over_Time);
           OvertimeButton.setVisibility(View.VISIBLE);
       }

    private void displayTaskButton(){
        Button TaskButton = (Button)findViewById(R.id.Button_Task);
        TaskButton.setVisibility(View.VISIBLE);
    }




}
