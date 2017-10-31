package com.example.user.loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String status = intent.getStringExtra(MainActivity.LOAN_STATUS);
        double repayment = intent.getDoubleExtra(MainActivity.LOAN_REPAYMENT, 0);
    }

    public void closeActivity(View view){
        finish();
    }
}
