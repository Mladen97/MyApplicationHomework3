package com.gosho.android.myapplicationhomework3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Violeta on 6/7/2016.
 */
public class Hello extends AppCompatActivity {
    TextView txtHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
        txtHello= (TextView) findViewById(R.id.textView_hello);

    }
}
