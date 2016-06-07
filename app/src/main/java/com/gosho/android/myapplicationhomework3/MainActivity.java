package com.gosho.android.myapplicationhomework3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtUser;
    TextView txtPass;
    EditText inputUser;
    EditText inputPass;
    Button btnSingIn;
    Button btnSingUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtUser= (TextView) findViewById(R.id.textView_user);
        txtPass = (TextView) findViewById(R.id.textView_pass);
        inputUser= (EditText) findViewById(R.id.editText_user);
        inputPass= (EditText) findViewById(R.id.editText_pass);
        btnSingIn= (Button) findViewById(R.id.btn_signIn);
        btnSingUp= (Button) findViewById(R.id.btn_signUp);

        btnSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Hello.class);
                startActivity(intent);
            }
        });
        btnSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CreateUser.class);
                startActivity(intent);
            }
        });

    }
}
