package com.example.twg;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView icBackArrow;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        icBackArrow = findViewById(R.id.icBackArrow);
        icBackArrow.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if(view == icBackArrow) finish();
    }
}