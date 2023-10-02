package com.example.appchamdiem.lab.lab2.bai3;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appchamdiem.R;

public class lab2bai3p1Activity extends AppCompatActivity implements View.OnClickListener {
private EditText etUserName;
private EditText etPassword;
private TextView tvNotAccountYet;
private Button btnSignIn;
private static final String REQUIRE = "require";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2bai3p1);

        etUserName = findViewById(R.id.editTextUserName);
        etPassword = findViewById(R.id.editTextPassword);
        tvNotAccountYet = findViewById(R.id.tvNotAcYet);
        btnSignIn = findViewById(R.id.buttonSignIn);

        tvNotAccountYet.setOnClickListener(this);
        btnSignIn.setOnClickListener(this);
    }

    private boolean checkInput() {
        if (TextUtils.isEmpty(etUserName.getText().toString())) {
            etUserName.setError(REQUIRE);
            return false;
        }
        if (TextUtils.isEmpty(etPassword.getText().toString())) {
            etPassword.setError(REQUIRE);
            return false;
        }
        return true;
    }
    private void signIn() {
        if (!checkInput()) {
            return;
        }
        Intent intent = new Intent(this, lab2bai3p3Activity.class);
        startActivity(intent);
        finish();
    }
    private void signUpForm() {
        Intent intent = new Intent(this, lab2bai3p2Activity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.buttonSignIn) {
            signIn();
        } else if (view.getId() == R.id.tvNotAcYet) {
            signUpForm();
        }
    }


}