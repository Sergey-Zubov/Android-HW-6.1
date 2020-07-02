package com.szubov.android_hw_61;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewValues;
    private Button mBtnSeven;
    private Button mBtnEight;
    private Button mBtnNine;
    private Button mBtnFour;
    private Button mBtnFive;
    private Button mBtnSix;
    private Button mBtnOne;
    private Button mBtnTwo;
    private Button mBtnThree;
    private Button mBtnZero;
    private Button mBtnDot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        mTextViewValues = findViewById(R.id.textViewValues);
        mBtnSeven = findViewById(R.id.btnSeven);
        mBtnEight = findViewById(R.id.btnEight);
        mBtnNine = findViewById(R.id.btnNine);
        mBtnFour = findViewById(R.id.btnFour);
        mBtnFive = findViewById(R.id.btnFive);
        mBtnSix = findViewById(R.id.btnSix);
        mBtnOne = findViewById(R.id.btnOne);
        mBtnTwo = findViewById(R.id.btnTwo);
        mBtnThree = findViewById(R.id.btnThree);
        mBtnZero = findViewById(R.id.btnZero);
        mBtnDot = findViewById(R.id.btnDot);


        mBtnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mTextViewValues.setText(new valueString.add(getText(R.string.btn_seven).toString()));
            }
        });

        mBtnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewValues.setText(getText(R.string.btn_eight).toString());
            }
        });

        mBtnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewValues.setText(getText(R.string.btn_nine).toString());
            }
        });

        mBtnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewValues.setText(getText(R.string.btn_four).toString());
            }
        });

        mBtnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewValues.setText(getText(R.string.btn_five).toString());
            }
        });

        mBtnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewValues.setText(getText(R.string.btn_six).toString());
            }
        });

        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewValues.setText(getText(R.string.btn_one).toString());
            }
        });

        mBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewValues.setText(getText(R.string.btn_two).toString());
            }
        });

        mBtnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewValues.setText(getText(R.string.btn_three).toString());
            }
        });

        mBtnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewValues.setText(getText(R.string.btn_zero).toString());
            }
        });

        mBtnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mTextViewValues.getText().toString().contains(getText(R.string.btn_dot).toString())) {
                    mTextViewValues.setText(getText(R.string.btn_dot).toString());
                }
            }
        });
    }
}