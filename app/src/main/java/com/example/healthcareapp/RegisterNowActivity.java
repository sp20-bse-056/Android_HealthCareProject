package com.example.healthcareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterNowActivity extends AppCompatActivity {
    EditText edSignUPName, edsignUPpassword , conPossward, edSignUpEmail;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_now);



        //assigning IDs
        edSignUPName = findViewById(R.id.RegUsername);
        edsignUPpassword= findViewById(R.id.RegPassword);
        btn = findViewById(R.id.regSignUp);
        tv=findViewById(R.id.RegisteredAlready);
        edSignUpEmail = findViewById(R.id.RegEmail);

        conPossward= findViewById(R.id.RegConPassword);


// btn click listner

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Regname = edSignUPName.getText().toString();
                String Regpassword = edsignUPpassword.getText().toString();

                String SignUpEmail = edSignUpEmail.getText().toString();
                String confPossward = conPossward.getText().toString();

                //=================
            DataBase db = new DataBase(getApplicationContext(), "Health Care" ,null, 1);

//===============
                if(Regname.length()==0 || Regpassword.length() ==0 || SignUpEmail.length()==0 || confPossward.length() ==0 ){

                    Toast.makeText(getApplicationContext(), " Please Fill all the fields", Toast.LENGTH_SHORT).show();

                }

                else if (!Regpassword.equals(confPossward))
                {
                    Toast.makeText(getApplicationContext(), " passwords didn't matched  ", Toast.LENGTH_SHORT).show();
                }else {
                    //==================
                    db.register(Regname, SignUpEmail, Regpassword);
                    //===================
                    Toast.makeText(getApplicationContext(), " Signed Up Successfully  ", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent( RegisterNowActivity.this ,LogInActivity.class));

                }
            }
        });

        //Start New activity

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent( RegisterNowActivity.this ,LogInActivity.class));



            }
        });








    }
    }
