package com.damas.uaskelompok7;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.w3c.dom.Text;

public class ForgotPassword extends AppCompatActivity  {
    private EditText etMailP;
    private TextView tvRegister4, tvLogin4;
    private Button btnResetPassword;
    FirebaseAuth mAuth;
    private ProgressBar pbProgressBar;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.lupa_sandi);

        etMailP = (EditText) findViewById(R.id.etMailP);
        pbProgressBar = (ProgressBar) findViewById(R.id.pbProgressBar);

        tvRegister4 = (TextView) findViewById(R.id.tvRegister4);
        tvRegister4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotPassword.this, Register.class);
                startActivity(intent);
            }
        });

        tvLogin4 = (TextView) findViewById(R.id.tvLogin4);
        tvLogin4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotPassword.this, Login.class);
                startActivity(intent);
            }
        });

        btnResetPassword = (Button) findViewById(R.id.btnResetPassword);
        btnResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetPassword();
            }
        });

        mAuth = FirebaseAuth.getInstance();
    }

    public void resetPassword(){
        String email = etMailP.getText().toString();
        if (TextUtils.isEmpty(email)) {
            input((EditText) etMailP, "Email");
        } else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            etMailP.setError("Tolong masukan email yang valid");
            etMailP.requestFocus();
            return;
        } else {
            pbProgressBar.setVisibility(View.VISIBLE);
            mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if(task.isSuccessful()){
                        pbProgressBar.setVisibility(View.GONE);
                        Toast.makeText(ForgotPassword.this, "Cek email anda untuk mereset password", Toast.LENGTH_SHORT).show();
                    } else {
                        pbProgressBar.setVisibility(View.GONE);
                        Toast.makeText(ForgotPassword.this, "Mohon maaf ada kesalahan! Silahkan coba lagi", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void input(EditText txt, String s) {
        txt.setError(s+" tidak boleh kosong");
        txt.requestFocus();
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}

