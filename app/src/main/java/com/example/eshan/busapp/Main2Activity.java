package com.example.eshan.busapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.maps.MapsInitializer;

public class Main2Activity extends AppCompatActivity {

    private EditText musername;
    private EditText mpassword;
    private Button msignin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        musername = findViewById(R.id.username);
        mpassword = findViewById(R.id.password);
        msignin = (Button)findViewById(R.id.signin);

        msignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = musername.getText().toString();
                String password = mpassword.getText().toString();

                if(username.equals("avengers") && password.equals("avengers"))
                {
                    Toast.makeText(Main2Activity.this,"Sign In Succesful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Main2Activity.this, MapsActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Main2Activity.this,"Sign In Failed", Toast.LENGTH_SHORT).show();
                    mpassword.setText("");
                }




            }
        });

    }
}
