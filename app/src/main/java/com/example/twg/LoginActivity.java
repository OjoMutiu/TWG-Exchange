package com.example.twg;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView textView, txtBtnSignUp;
    private MaterialButton btnLogin;
    private ImageView imgFaceBookLogo, imgGoogleLogo, imgLinkedinLogo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_login);

        textView = (TextView) findViewById(R.id.txtBtnForget);
        textView.setOnClickListener(this);
        txtBtnSignUp = findViewById(R.id.txtBtnSignup);
        txtBtnSignUp.setOnClickListener(this);

        btnLogin = findViewById(R.id.btnLogin);

        imgFaceBookLogo = findViewById(R.id.imgFaceBookLogo);
        imgGoogleLogo = findViewById(R.id.imgGoogleLogo);
        imgLinkedinLogo = findViewById(R.id.imgLinkedinLogo);

    }

    @Override
    public void onClick(View view) {
        if(view == textView){
            Toast.makeText(this, "Forgot Password was pressed", Toast.LENGTH_SHORT).show();
        }else if(view==txtBtnSignUp){
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        }

    }
}
