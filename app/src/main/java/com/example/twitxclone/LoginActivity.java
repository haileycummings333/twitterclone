package com.example.twitxclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button signupButton;
    Button loginButton;

    View.OnClickListener loginListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText editText = findViewById(R.id.user_field);
            final String username = editText.getText().toString();

            editText = findViewById(R.id.pass_field);
            final String password = editText.getText().toString();

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signupButton = findViewById(R.id.signup_button);
        loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(loginListener);
    }


    public void signUp(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

}