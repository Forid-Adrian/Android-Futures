package com.home.practiceapps;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginPage extends AppCompatActivity {

    EditText edUser,edEmail,edPassword;
    Button signUp , button;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login_page);

        edUser = findViewById(R.id.edUserName);
        edEmail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);
        signUp = findViewById(R.id.buttonSignUp);
        button = findViewById(R.id.buttonx);

        sharedPreferences = getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE);
        editor = sharedPreferences.edit();

        signUp.setOnClickListener(v -> {

            String userName = edUser.getText().toString();
            String email = edEmail.getText().toString();
            String password = edPassword.getText().toString();

            editor.putString("userName",""+userName);
            editor.putString("userEmail",""+email);
            editor.putString("userPassword",password);
            editor.apply();
        });
        button.setOnClickListener(v -> {
            startActivity(new Intent(LoginPage.this,Data.class));
        });









    }
}