package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String someName= intent.getStringExtra("someName");
        String someName1= intent.getStringExtra("someName1");
        String someName2= intent.getStringExtra("someName2");
        String someName3= intent.getStringExtra("someName3");
        String someName4= intent.getStringExtra("someName4");
        String someName5= intent.getStringExtra("someName5");
        String someName6= intent.getStringExtra("someName6");
        String someName7= intent.getStringExtra("someName7");
        String someName8= intent.getStringExtra("someName8");
        String someName9= intent.getStringExtra("someName9");

        TextView txtView = findViewById(R.id.name1);
        TextView txtView1 = findViewById(R.id.dob1);
        TextView txtView2 = findViewById(R.id.address1);
        TextView txtView3 = findViewById(R.id.pincode1);
        TextView txtView4 = findViewById(R.id.mobile1);
        TextView txtView5 = findViewById(R.id.email1);
        TextView txtView6 = findViewById(R.id.interest1);
        TextView txtView7 = findViewById(R.id.profile1);
        TextView txtView8 = findViewById(R.id.experience1);
        TextView txtView9 = findViewById(R.id.city1);
        txtView.setText("Name: "+someName);
        txtView1.setText("DOB: "+someName1);
        txtView2.setText("Address: "+someName2);
        txtView3.setText("Pincode: "+someName3);
        txtView4.setText("Mobile: "+someName4);
        txtView5.setText("Email: "+someName5);
        txtView6.setText("Interest: "+someName6);
        txtView7.setText("Profile: "+someName7);
        txtView8.setText("Experience: "+someName8);
        txtView9.setText("City: "+someName9);
    }
}