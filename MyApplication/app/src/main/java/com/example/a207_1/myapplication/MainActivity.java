package com.example.a207_1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtWidth, edtLength, edtHeight;
    private Button btnCalculate;
    private TextView tvResult;
    private static final String STATE_HASIL="state_hasil";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtWidth = (EditText) findViewById(R.id.edt_width);
        edtLength = (EditText) findViewById(R.id.edt_length);
        edtHeight =
    }
}
