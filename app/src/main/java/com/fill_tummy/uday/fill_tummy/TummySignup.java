package com.fill_tummy.uday.fill_tummy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class TummySignup extends AppCompatActivity {

    EditText name;
    EditText uname;
    EditText password;
    EditText phno;
    Spinner Type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tummy_signup);
        name = (EditText) findViewById(R.id.name);
        uname = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.signupass);
        phno = (EditText) findViewById(R.id.Phonenumber);
        Type = (Spinner) findViewById(R.id.signupsp);
    }

    public void create(View view)

    {
        Toast.makeText(getApplication(),"created",Toast.LENGTH_LONG);
    }

}
