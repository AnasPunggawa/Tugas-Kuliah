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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

import java.util.regex.Pattern;

public class Register extends AppCompatActivity {
    DatabaseReference database = FirebaseDatabase.getInstance().getReference();
    private FirebaseAuth mAuth;
    private TextView tvLogin3;
    private EditText etNameR, etMailR, etPasswordR;
    private Button btnRegister;
    private ProgressBar pbProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        etNameR = (EditText) findViewById(R.id.etNameR);
        etMailR = (EditText) findViewById(R.id.etMailR);
        etPasswordR = (EditText) findViewById(R.id.etPasswordR);
        pbProgressBar = (ProgressBar) findViewById(R.id.pbProgressBar);

        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });

        tvLogin3 = (TextView) findViewById(R.id.tvLogin3);
        tvLogin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
            }
        });
    }

    private void register() {
        String name = etNameR.getText().toString();
        String email = etMailR.getText().toString();
        String password = etPasswordR.getText().toString();

        if (TextUtils.isEmpty(email)) {
            input((EditText) etMailR, "Email");
        } else if (TextUtils.isEmpty(password)) {
            input((EditText) etPasswordR, "Password");
        } else if(TextUtils.isEmpty(name)) {
            input((EditText) etNameR, "Nama");
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etMailR.setError("Tolong tuliskan email yang valid");
            etMailR.requestFocus();
            return;
        } else {
            pbProgressBar.setVisibility(View.VISIBLE);
            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        User user = new User(name, email, password);
                        FirebaseDatabase.getInstance().getReference("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()){
                                    pbProgressBar.setVisibility(View.GONE);
                                    Toast.makeText(Register.this, "Akun telah sukses terdaftar", Toast.LENGTH_SHORT).show();
                                } else {
                                    pbProgressBar.setVisibility(View.GONE);
                                    Toast.makeText(Register.this, "Gagal untuk mendaftar, coba lagi!", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    } else {
                        pbProgressBar.setVisibility(View.GONE);
                        Toast.makeText(Register.this, "Mohon maaf, gagal mendaftar. Silahkan coba lagi", Toast.LENGTH_SHORT).show();
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

