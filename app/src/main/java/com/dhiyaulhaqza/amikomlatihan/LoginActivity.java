package com.dhiyaulhaqza.amikomlatihan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etEmail;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        setupView();
        setupViewListener();
    }

    private void setupViewListener() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    private void login() {
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        Toast.makeText(this, isUserExists(email, password) ? "Login success":
                "Login failed", Toast.LENGTH_SHORT).show();

        String msg;

        if (isUserExists(email, password))  {
            msg = "Login success";
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("data", email);
            startActivity(intent);
            finish();
        } else {
            msg = "Login failed";
        }

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    private boolean isUserExists(String email, String password) {
        return email.equals("admin") && password.equals("1234");
    }

    private void setupView() {
        etEmail = (EditText) findViewById(R.id.et_email);
        etPassword = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
    }
}
