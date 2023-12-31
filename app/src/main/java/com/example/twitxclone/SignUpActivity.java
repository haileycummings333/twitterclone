package com.example.twitxclone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;


public class SignUpActivity extends AppCompatActivity {

    EditText usernameText;
    EditText passwordText;
    EditText dobText;
    Button signUp;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        usernameText = findViewById(R.id.user_field);
        passwordText = findViewById(R.id.pass_field);
        dobText = findViewById(R.id.dob_field);
        signUp = findViewById(R.id.signup_button);
        signUp.setOnClickListener(listener);
        fAuth = FirebaseAuth.getInstance();
    }

    public void onSignup(View view){
        String usern = usernameText.getText().toString();
        String password = passwordText.getText().toString();
        String dob = dobText.getText().toString();

        fAuth.createUserWithEmailAndPassword(usern, password).
                addOnCompleteListener(new OnCompleteListener<AuthResult>(){

                })
    }


    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };




    public void onSignUp(View view) {
        String usern = usernameText.getText().toString();
        String password = passwordText.getText().toString();
        String dob = dobText.getText().toString();

    }

}