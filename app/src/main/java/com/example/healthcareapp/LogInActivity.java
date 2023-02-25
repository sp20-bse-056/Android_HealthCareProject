package com.example.healthcareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {

    EditText edUserName, edpassword;
    Button btn;
    TextView tv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);


        //assigning IDs
        edUserName = findViewById(R.id.RegUsername);
        edpassword= findViewById(R.id.RegPassword);
        btn = findViewById(R.id.regSignUp);
        tv=findViewById(R.id.RegisteredAlready);

// btn click listner

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 String username = edUserName.getText().toString();
                 String password = edpassword.getText().toString();
                 DataBase db = new DataBase(getApplicationContext(), "Health Care" ,null, 1);


                 if(username.length()==0 || password.length() ==0){

                     Toast.makeText(getApplicationContext(), " Please Fill all the fields", Toast.LENGTH_SHORT).show();

                 }

//                 else{
//                     if(db.login(username,password)==1){
//
//                         SharedPreferences sharedPreferences = getSharedPreferences("shered prefs", Context.MODE_PRIVATE);
//
//                         SharedPreferences.Editor editor=sharedPreferences.edit();
//                         editor.putString("username", username);
//                         editor.putString("password", password);
//                         editor.apply();
//
//                         Toast.makeText(getApplicationContext(), " LogIn Success", Toast.LENGTH_SHORT).show();
//
//
//                         startActivity(new Intent( LogInActivity.this ,HomeActivity.class));
//
//
//                     }
//
//                     else {
//
//
//                         Toast.makeText(getApplicationContext(), " Invalid Username and Password  ", Toast.LENGTH_SHORT).show();
//                         startActivity(new Intent( LogInActivity.this ,HomeActivity.class));
//
//
//                     }
//
//
//
//                     tv.setOnClickListener(new View.OnClickListener() {
//                         @Override
//                         public void onClick(View view) {
//
//                             startActivity(new Intent( LogInActivity.this ,RegisterNowActivity.class));
//
//
//
//                         }
//                     });
//
//
//
//
//
//
//                 }
//==================================

                 else {


                         Toast.makeText(getApplicationContext(), " Invalid Username and Password  ", Toast.LENGTH_SHORT).show();


                         startActivity(new Intent( LogInActivity.this ,HomeActivity.class));


                     }

                 tv.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View view) {

                             startActivity(new Intent( LogInActivity.this ,RegisterNowActivity.class));



                         }
                     });
//






             //pasting above

             }
         });

//Start New activity

 tv.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        startActivity(new Intent( LogInActivity.this ,RegisterNowActivity.class));



    }
});



    }
}