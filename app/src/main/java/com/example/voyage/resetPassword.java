package com.example.voyage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class resetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
    }
    public void recoveryClick(View view)
    {
        Toast.makeText(getApplicationContext(),"A new password has been sent to your email", Toast.LENGTH_SHORT).show();
    }

}
