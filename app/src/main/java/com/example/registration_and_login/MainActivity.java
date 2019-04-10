package com.example.registration_and_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mTextUsername;
    EditText mTextPassword;
    Button mButtonLogin;
    Button mButtonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextUsername =(EditText)findViewById(R.id.edittext_username);
        mTextPassword =(EditText)findViewById(R.id.edittext_password);
        mButtonLogin =(Button)findViewById(R.id.button_login);
        mButtonRegister =(Button) findViewById(R.id.button_register);
        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent;
                registerIntent = new Intent(MainActivity.this,Student_Registration.class);
                startActivity(registerIntent);
            }
        });
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent;
                loginIntent = new Intent(MainActivity.this,welcome.class);
                startActivity(loginIntent);

            }
        });


    }
}
