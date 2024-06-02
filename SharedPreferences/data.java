package com.home.practiceapps;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class data extends AppCompatActivity {

    TextView textViewData;
    SharedPreferences sharedPreferences ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.data_activity);
        textViewData = findViewById(R.id.textviewdata);

        sharedPreferences  = getSharedPreferences(getString(R.string.app_name),MODE_PRIVATE);
        String name = sharedPreferences.getString("userName", "defult");
        String email = sharedPreferences.getString("userEmail", "defult");
        String password = sharedPreferences.getString("userPassword", "defult");

        textViewData.setText(" user: "+name+"\n email : "+email+"\n password: "+password);


    }
}