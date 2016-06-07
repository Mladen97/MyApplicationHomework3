package com.gosho.android.myapplicationhomework3;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Violeta on 6/7/2016.
 */
public class CreateUser extends AppCompatActivity {
    TextView txtUsername;
    TextView txtPassword;
    TextView txtConfPassword;
    TextView crtUser;
    EditText inputUsername;
    EditText inputPassword;
    EditText inputConfPass;
    Button btnCanlcel;
    Button btnCreate;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);
        txtUsername = (TextView) findViewById(R.id.textView_username);
        txtPassword = (TextView) findViewById(R.id.textView_password);
        txtConfPassword = (TextView) findViewById(R.id.textView_confernPass);
        crtUser = (TextView) findViewById(R.id.textView_createUser);
        inputUsername = (EditText) findViewById(R.id.editText_username);
        inputPassword = (EditText) findViewById(R.id.editText_password);
        inputConfPass = (EditText) findViewById(R.id.editText_confernPassword);
        btnCreate = (Button) findViewById(R.id.btn_create);
        btnCanlcel = (Button) findViewById(R.id.btn_cancel);
        sp = this.getPreferences(MODE_PRIVATE);
        sp.edit().putString("Username", String.valueOf(R.id.editText_username)).apply();
        sp.edit().putString("Password", String.valueOf(R.id.editText_password)).apply();
        sp.edit().putString("ConfernPassword", String.valueOf(R.id.editText_confernPassword)).apply();

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sp.edit().putString("Username", String.valueOf(R.id.editText_username)).apply();
                sp.edit().putString("Password", String.valueOf(R.id.editText_password)).apply();
                sp.edit().putString("ConfernPassword", String.valueOf(R.id.editText_confernPassword)).apply();
            }
        });


    }
}
