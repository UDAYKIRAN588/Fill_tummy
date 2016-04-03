package com.fill_tummy.uday.fill_tummy;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText username;
    public EditText password;
    public Spinner  Type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tummy_login);

        username = (EditText)findViewById(R.id.Loginus);
        password = (EditText)findViewById(R.id.Loginpassword);
        Type = (Spinner)findViewById(R.id.Loginsp);






    }

    public void submit (View view)
    {
        //TODO
        Toast.makeText(getApplicationContext(),"sfasfsa",Toast.LENGTH_LONG).show();

    }

    public void signUp (View view)
    {
        Intent i = new Intent();
        i.setComponent(new ComponentName(getApplicationContext(),TummySignup.class));
        i.resolveActivity(getPackageManager());
        startActivity(i);

    }

}
