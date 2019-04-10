package com.example.registration_and_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Student_Registration extends AppCompatActivity {
    EditText mTextFirstname;
    EditText mTextLastname;
    EditText mTextUsername;
    EditText mTextEmail;
    EditText mTextPassword;
    EditText mTextConfirmPassword;
    Button mButtonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__registration);

        getSupportActionBar().setTitle(" Student Registration");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mTextFirstname =(EditText)findViewById(R.id.firstname);
        mTextLastname =(EditText)findViewById(R.id.lastname);
        mTextUsername =(EditText)findViewById(R.id.usernam);
        mTextEmail =(EditText)findViewById(R.id.email);
        mTextPassword =(EditText)findViewById(R.id.passwor);
        mTextConfirmPassword =(EditText)findViewById(R.id.conf_password);
        mButtonRegister =(Button) findViewById(R.id.registe);
        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent;
                registerIntent = new Intent(Student_Registration.this,MainActivity.class);
                startActivity(registerIntent);
            }
        });
    }
}
