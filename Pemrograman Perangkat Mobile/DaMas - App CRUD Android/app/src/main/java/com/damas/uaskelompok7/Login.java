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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {
    private TextView register, tvLupaPassword;
    private Button btnLogin;
    private EditText etMailL, etPasswordL;
    private FirebaseAuth mAuth;
    private ProgressBar pbProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        pbProgressBar = (ProgressBar) findViewById(R.id.pbProgressBar);

        register = (TextView) findViewById(R.id.tvRegister2);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });

        tvLupaPassword = (TextView) findViewById(R.id.tvLupaPassword);
        tvLupaPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, ForgotPassword.class);
                startActivity(intent);
            }
        });

        etMailL = (EditText) findViewById(R.id.etMailL);
        etPasswordL = (EditText) findViewById(R.id.etPasswordL);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLogin();
            }
        });

        mAuth = FirebaseAuth.getInstance();
    }

    private void userLogin() {
        String email = etMailL.getText().toString();
        String password = etPasswordL.getText().toString();

        if (TextUtils.isEmpty(email)) {
            input((EditText) etMailL, "Email");
        } else if (TextUtils.isEmpty(password)) {
            input((EditText) etPasswordL, "Password");
        } else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            etMailL.setError("Tolong masukan email yang valid");
            etMailL.requestFocus();
            return;
        } else {
            pbProgressBar.setVisibility(View.VISIBLE);
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                        if(user.isEmailVerified()){
                            Intent intent = new Intent(Login.this, MainActivity.class);
                            startActivity(intent);
                        } else {
                            user.sendEmailVerification();
                            pbProgressBar.setVisibility(View.GONE);
                            Toast.makeText(Login.this, "Cek email untuk vertifikasi akun anda", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        pbProgressBar.setVisibility(View.GONE);
                        Toast.makeText(Login.this, "Gagal login, harap coba lagi!", Toast.LENGTH_SHORT).show();
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


