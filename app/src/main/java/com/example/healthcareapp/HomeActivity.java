package com.example.healthcareapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



//On clicking find Log Out
        CardView logout = findViewById(R.id.CardLogOut);

logout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        startActivity(new Intent(HomeActivity.this, LogInActivity.class));
        Toast.makeText(getApplicationContext(), " LogOut SuccessFully  ", Toast.LENGTH_SHORT).show();

    }
});


//On clicking find doctor card

        CardView findDoctor  = findViewById(R.id.findDoctor);

        findDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HomeActivity.this, FindDoctorActivity.class));
                Toast.makeText(getApplicationContext(), "  Choose your desired Doctor ", Toast.LENGTH_SHORT).show();



            }
        });



    }
}