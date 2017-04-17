package com.example.jkevin.toastutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnOne, mBtnTwo, mBtnThree, mBtnFour;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnOne = (Button) findViewById(R.id.btn_one);
        mBtnTwo = (Button) findViewById(R.id.btn_two);
        mBtnThree = (Button) findViewById(R.id.btn_three);
        mBtnFour = (Button) findViewById(R.id.btn_four);
        mBtnOne.setOnClickListener(this);
        mBtnTwo.setOnClickListener(this);
        mBtnThree.setOnClickListener(this);
        mBtnFour.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_one:
                showToast("Hello", R.drawable.ic_moto);
                break;
            case R.id.btn_two:
                showToast("Android", R.drawable.ic_rocket);
                break;
            case R.id.btn_three:
                showToast("Android", R.drawable.ic_ship);
                break;
            case R.id.btn_four:
                showToast2("Kevin\t" + ++count, R.drawable.ic_jewel);
                break;
        }
    }

    private void showToast(String message, int resId) {
        ToastUtils.showKevinToast(MainActivity.this, message, resId);
    }private void showToast2(String message, int resId) {
        ToastUtils.showKevinToast(message, resId,MainActivity.this);
    }
}
