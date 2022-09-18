package com.damas.uaskelompok7;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DialogForm extends DialogFragment {
    String nama, nim, jurusan, key, pilih;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();

    public DialogForm(String nama, String nim, String jurusan, String key, String pilih) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.key = key;
        this.pilih = pilih;
    }

    TextView ic_name;
    TextView in_namleng;
    TextView in_nim;
    TextView in_jurusan;
    Button btn_tambah;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.input_data, container, false);

        ic_name = view.findViewById(R.id.ic_name);
        in_namleng = view.findViewById(R.id.in_namleng);
        in_nim = view.findViewById(R.id.in_nim);
        in_jurusan = view.findViewById(R.id.in_jurusan);
        btn_tambah = view.findViewById(R.id.btn_tambah);


        in_namleng.setText(nama);
        in_nim.setText(nim);
        in_jurusan.setText(jurusan);

        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = in_namleng.getText().toString();
                String nim = in_nim.getText().toString();
                String jurusan = in_jurusan.getText().toString();

                if (TextUtils.isEmpty(nama)) {
                    input((EditText) in_namleng, "Nama Lengkap");
                } else if (TextUtils.isEmpty(nim)) {
                    input((EditText) in_nim, "NIM");
                } else if (TextUtils.isEmpty(jurusan)) {
                    input((EditText) in_jurusan, "Jurusan");
                } else {
                    if (pilih.equals("Tambah")){
                        myRef.child("Data").push().setValue(new Mahasiswa(nama, nim, jurusan)).addOnSuccessListener(new OnSuccessListener() {
                            @Override
                            public void onSuccess(Object o) {
                                Toast.makeText(view.getContext(), "Data Tersimpan", Toast.LENGTH_SHORT).show();
                            }

                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(view.getContext(), "Data Gagal Tersimpan", Toast.LENGTH_SHORT).show();
                            }
                        });
                    } else if (pilih.equals("Ubah")){
                        myRef.child("Data").child(key).setValue(new Mahasiswa(nama, nim, jurusan)).addOnSuccessListener(new OnSuccessListener() {
                            @Override
                            public void onSuccess(Object o) {
                                Toast.makeText(view.getContext(), "Data Berhasil Diubah", Toast.LENGTH_SHORT).show();
                                dismiss();
                            }

                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(view.getContext(), "Data Gagal Diubah", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }
            }
        });

        return view;
    }

    public void onStart(){
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null){
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        }
        if(pilih.equals("Tambah")) {
            ic_name.setText("Masukkan Data");
        } else if(pilih.equals("Ubah")) {
            ic_name.setText("Mengubah Data");
        }
    }

    private void input(EditText txt, String s){
        txt.setError(s+ " Wajib Diisi");
        txt.requestFocus();
    }
}
