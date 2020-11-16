package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view) {
        TextView txtView = findViewById(R.id.name1);
        EditText edtTxtName = findViewById(R.id.name);


        TextView txtView1 = findViewById(R.id.dob1);
        EditText edtTxtName1 = findViewById(R.id.dob);


        TextView txtView2 = findViewById(R.id.address1);
        EditText edtTxtName2 = findViewById(R.id.address);


        TextView txtView3 = findViewById(R.id.pincode1);
        EditText edtTxtName3 = findViewById(R.id.pincode);


        TextView txtView4 = findViewById(R.id.mobile1);
        EditText edtTxtName4 = findViewById(R.id.mobile);
//        txtView.setText("Name: "+edtTxtName.getText().toString());

        TextView txtView5 = findViewById(R.id.email1);
        EditText edtTxtName5 = findViewById(R.id.email);
//        txtView.setText("Name: "+edtTxtName.getText().toString());

        TextView txtView6 = findViewById(R.id.interest1);
        EditText edtTxtName6 = findViewById(R.id.interest);
//        txtView.setText("Name: "+edtTxtName.getText().toString());

        TextView txtView7 = findViewById(R.id.profile1);
        EditText edtTxtName7 = findViewById(R.id.profile);
//        txtView.setText("Name: "+edtTxtName.getText().toString());

        TextView txtView8 = findViewById(R.id.experience1);
        EditText edtTxtName8 = findViewById(R.id.experience);
//        txtView.setText("Name: "+edtTxtName.getText().toString());

        TextView txtView9 = findViewById(R.id.city1);
        EditText edtTxtName9 = findViewById(R.id.city);
//        txtView.setText("Name: "+edtTxtName.getText().toString());
//        txtView9.setText("City: "+edtTxtName9.getText().toString());
//        txtView1.setText("DOB: "+edtTxtName1.getText().toString());
//        txtView2.setText("Address: "+edtTxtName2.getText().toString());
//        txtView3.setText("Pincode: "+edtTxtName3.getText().toString());
//        txtView4.setText("Mobile: "+edtTxtName4.getText().toString());
//        txtView5.setText("Email: "+edtTxtName5.getText().toString());
//        txtView6.setText("Interest: "+edtTxtName6.getText().toString());
//        txtView7.setText("Profile: "+edtTxtName7.getText().toString());
//        txtView8.setText("Experience: "+edtTxtName8.getText().toString());
        String Name = edtTxtName.getText().toString();
        String City = edtTxtName9.getText().toString();
        String DOB = edtTxtName1.getText().toString();
        String Address = edtTxtName2.getText().toString();
        String Pincode = edtTxtName3.getText().toString();
        String Mobile = edtTxtName4.getText().toString();
        String Email = edtTxtName5.getText().toString();
        String Interest = edtTxtName6.getText().toString();
        String Profile = edtTxtName7.getText().toString();
        String Experience = edtTxtName8.getText().toString();

        Intent i = new Intent(this, DisplayMessageActivity.class);
        i.putExtra("someName", edtTxtName.getText().toString());
        i.putExtra("someName1", edtTxtName1.getText().toString());
        i.putExtra("someName2", edtTxtName2.getText().toString());
        i.putExtra("someName3", edtTxtName3.getText().toString());
        i.putExtra("someName4", edtTxtName4.getText().toString());
        i.putExtra("someName5", edtTxtName5.getText().toString());
        i.putExtra("someName6", edtTxtName6.getText().toString());
        i.putExtra("someName7", edtTxtName7.getText().toString());
        i.putExtra("someName8", edtTxtName8.getText().toString());
        i.putExtra("someName9", edtTxtName9.getText().toString());

        startActivity(i);
        Toast.makeText(getApplicationContext(),"The Registration is successful",Toast.LENGTH_LONG);
    }
}