package com.szubov.android_hw_61;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayDeque;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewValues;
    private ArrayDeque<String> values = new ArrayDeque<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        mTextViewValues = findViewById(R.id.textViewValues);
        Button mBtnSeven = findViewById(R.id.btnSeven);
        Button mBtnEight = findViewById(R.id.btnEight);
        Button mBtnNine = findViewById(R.id.btnNine);
        Button mBtnFour = findViewById(R.id.btnFour);
        Button mBtnFive = findViewById(R.id.btnFive);
        Button mBtnSix = findViewById(R.id.btnSix);
        Button mBtnOne = findViewById(R.id.btnOne);
        Button mBtnTwo = findViewById(R.id.btnTwo);
        Button mBtnThree = findViewById(R.id.btnThree);
        Button mBtnZero = findViewById(R.id.btnZero);
        Button mBtnDot = findViewById(R.id.btnDot);


        mBtnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values.isEmpty() || !mTextViewValues.getText().toString().matches("^(0)$")) {
                    addValueToTextView(getText(R.string.btn_seven).toString());
                }
            }
        });

        mBtnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values.isEmpty() || !mTextViewValues.getText().toString().matches("^(0)$")) {
                    addValueToTextView(getText(R.string.btn_eight).toString());
                }
            }
        });

        mBtnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values.isEmpty() || !mTextViewValues.getText().toString().matches("^(0)$")) {
                    addValueToTextView(getText(R.string.btn_nine).toString());
                }
            }
        });

        mBtnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values.isEmpty() || !mTextViewValues.getText().toString().matches("^(0)$")) {
                    addValueToTextView(getText(R.string.btn_four).toString());
                }
            }
        });

        mBtnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values.isEmpty() || !mTextViewValues.getText().toString().matches("^(0)$")) {
                    addValueToTextView(getText(R.string.btn_five).toString());
                }
            }
        });

        mBtnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values.isEmpty() || !mTextViewValues.getText().toString().matches("^(0)$")) {
                    addValueToTextView(getText(R.string.btn_six).toString());
                }
            }
        });

        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values.isEmpty() || !mTextViewValues.getText().toString().matches("^(0)$")) {
                    addValueToTextView(getText(R.string.btn_one).toString());
                }
            }
        });

        mBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values.isEmpty() || !mTextViewValues.getText().toString().matches("^(0)$")) {
                    addValueToTextView(getText(R.string.btn_two).toString());
                }
            }
        });

        mBtnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values.isEmpty() || !mTextViewValues.getText().toString().matches("^(0)$")) {
                    addValueToTextView(getText(R.string.btn_three).toString());
                }
            }
        });

        mBtnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values.isEmpty() || !mTextViewValues.getText().toString().matches("^(0)$")) {
                    addValueToTextView(getText(R.string.btn_zero).toString());
                }
            }
        });

        mBtnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mTextViewValues.getText().toString().contains(getText(R.string.btn_dot).toString())) {
                    if (!values.isEmpty()) {
                        addValueToTextView(getText(R.string.btn_dot).toString());
                    }
                }
            }
        });
    }

    private String editValuesToString(ArrayDeque<String> values) {
        StringBuilder sb = new StringBuilder();
        for (String value : values) {
            sb.append(value);
        }
        return sb.toString();
    }

    private void addValueToTextView(String string) {
        if (values.size() <= 30) {
            values.add(string);
            mTextViewValues.setText(editValuesToString(values));
        } else {
            Toast.makeText(MainActivity.this,
                    getText(R.string.too_many_characters).toString(), Toast.LENGTH_LONG).show();
        }
    }
}