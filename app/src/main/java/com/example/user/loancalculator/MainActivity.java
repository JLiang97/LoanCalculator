package com.example.user.loancalculator;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v4.media.MediaBrowserServiceCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String LOAN_STATUS = "status";
    public static final String LOAN_REPAYMENT = "repayment";
    public double price, payment, rate, repayment, salary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateRepayment(View view){
        Intent intent = new Intent(this, ResultActivity.class);

        intent.putExtra(LOAN_STATUS, "Approve");
        startActivity(intent);
    }
}
