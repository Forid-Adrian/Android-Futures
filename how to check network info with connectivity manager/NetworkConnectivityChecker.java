package com.home.androidfutures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;

public class NetworkConnectivityChecker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.network_connectivity_checker);

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo!=null && networkInfo.isConnected()){
            Toast.makeText(this, "Network connectivity successfully", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Network error", Toast.LENGTH_SHORT).show();
        }

    }
}