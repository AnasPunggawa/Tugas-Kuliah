package com.damas.uaskelompok7;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    DatabaseReference databaseD;
    DatabaseReference databaseU;
    FirebaseAuth mAuth;
    FirebaseUser user;
    ImageButton btnLogout;
    FloatingActionButton fbtn_tambah;
    RecyclerAdapter recyclerAdapter;
    ArrayList<Mahasiswa> listMahasiswa;
    RecyclerView rv_view;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fbtn_tambah = findViewById(R.id.fbtn_tambah);
        rv_view = findViewById(R.id.rv_view);
        btnLogout = findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(MainActivity.this, Login.class));
            }
        });

        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(this);
        rv_view.setLayoutManager(mLayout);
        rv_view.setItemAnimator(new DefaultItemAnimator());

        fbtn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogForm dialogForm = new DialogForm("", "", "", "", "Tambah");
                dialogForm.show(getSupportFragmentManager(), "form");
            }
        });
        mAuth = FirebaseAuth.getInstance();
        showData();
    }

    private void showData(){
        user = FirebaseAuth.getInstance().getCurrentUser();
        databaseU = FirebaseDatabase.getInstance().getReference("Users");
        userID = user.getUid();
        databaseU.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userProfile = snapshot.getValue(User.class);
                if (userProfile != null) {
                    final TextView tvAkun = findViewById(R.id.tvAkun);
                    String name = userProfile.name;
                    String email = userProfile.email;
                    String password = userProfile.password;
                    tvAkun.setText("Selamat datang, " +name+ "!");
                } else {
                    startActivity(new Intent(MainActivity.this, Login.class));
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(MainActivity.this, "Terjadi kesalaham!", Toast.LENGTH_SHORT).show();
            }
        });

        databaseD = FirebaseDatabase.getInstance().getReference();
        databaseD.child("Data").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                listMahasiswa = new ArrayList<>();
                for (DataSnapshot item : snapshot.getChildren()){
                    Mahasiswa mhs = item.getValue(Mahasiswa.class);
                    mhs.setKey(item.getKey());
                    listMahasiswa.add(mhs);
                }

                recyclerAdapter = new RecyclerAdapter(listMahasiswa, MainActivity.this);
                rv_view.setAdapter(recyclerAdapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(MainActivity.this, "Terjadi Kesalahan saat pengambilan data!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed(){
        finishAffinity();
    }
}