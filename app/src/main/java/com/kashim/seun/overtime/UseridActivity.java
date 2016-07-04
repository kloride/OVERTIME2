package com.kashim.seun.overtime;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by USER on 6/27/2016.
 */
public class UseridActivity extends AppCompatActivity {
    private static final byte REQUEST_IMAGE_CAPTURE =1;
    String name;
    {
        name = "UserId,ClockIn,ClockOut,Break,Task,Overtime";
    }Intent LoginIntent = new Intent(UseridActivity.this, WelcomeadminActivity.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userid);
}


    public void takePhoto(View v) {
        Intent takePhotoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if (takePhotoIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePhotoIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && requestCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imgBitmap = (Bitmap) extras.get("data");

            ImageView photoImageView = (ImageView) findViewById(R.id.image_view_Photo);
            photoImageView.setImageBitmap(imgBitmap);
        }
    }




public void displayUserId(String name){
    EditText UserIdEditText =(EditText)findViewById(R.id.Edit_Text_User_User_id);
    UserIdEditText.setText("" + UserIdEditText);
}
    private void displayClockIn(){
        Button ClockInButton = (Button)findViewById(R.id.Button_Clock_In);
        ClockInButton.isClickable();
    }

    private void displayClockOut(){
        Button ClockOutButton = (Button)findViewById(R.id.Button_Clock_Out);
        ClockOutButton.isClickable();
    }

    private void displayBreak(){
        Button BreakButton =(Button)findViewById(R.id.Button_Break);
        BreakButton.isClickable();
    }

    private void displayOvertime(){
        Button Overtime = (Button)findViewById(R.id.Button_Over_Time);
        Overtime.isClickable();
    }

    private void displayTask(){
        EditText TaskEditText =(EditText)findViewById(R.id.Edit_Text_Task);
        TaskEditText.setText("" + TaskEditText);

    }

}





