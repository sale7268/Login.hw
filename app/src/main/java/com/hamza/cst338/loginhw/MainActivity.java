package com.hamza.cst338.loginhw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hamza.cst338.loginhw.LoginActivity;
import com.hamza.cst338.loginhw.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button logInButton = findViewById(R.id.btnLogIn);
        logInButton.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v){

        if(v.getId() == R.id.btnLogIn){
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
        }
    }
}