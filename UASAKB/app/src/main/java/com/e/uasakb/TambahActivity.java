package com.e.uasakb;

//Taggal : 1-8-2019
//10116116
//Ammar Rifqul Abrar
//AKB-3

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class TambahActivity extends AppCompatActivity



        implements View.OnClickListener {
    Button btnSimpan, btnTampil;
    EditText nim, nama, kelas, telepon, email, line, instagram;
    String sNama, sKelas, sEmail, sLine, sInstagram;
    Integer sNim, sTelepon;
    Realm realm;
    RealmHelper realmHelper;
    MahasiswaModel mahasiswaModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);

        //Inisialisasi
        btnSimpan = findViewById(R.id.btnSimpan);
        btnTampil = findViewById(R.id.btnTampil);
        nim = findViewById(R.id.nim);
        nama = findViewById(R.id.nama);
        kelas = findViewById(R.id.kelas);
        telepon = findViewById(R.id.telepon);
        email = findViewById(R.id.email);
        line = findViewById(R.id.line);
        instagram = findViewById(R.id.instagram);


        //Set up Realm
        Realm.init(TambahActivity.this);
        RealmConfiguration configuration = new RealmConfiguration.Builder().build();
        realm = Realm.getInstance(configuration);

        btnSimpan.setOnClickListener(this);
        btnTampil.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnSimpan){
            sNim = Integer.parseInt(nim.getText().toString());
            sNama = nama.getText().toString();
            sKelas = kelas.getText().toString();
            sTelepon = Integer.parseInt(telepon.getText().toString());
            sEmail = email.getText().toString();
            sLine = line.getText().toString();
            sInstagram = instagram.getText().toString();

            if (!sNim.equals("") && !sNama.isEmpty() && !sKelas.isEmpty() && !sTelepon.equals("") && !sEmail.isEmpty() && !sLine.isEmpty() && !sInstagram.isEmpty())
            {
                mahasiswaModel = new MahasiswaModel();
                mahasiswaModel.setNim(sNim);
                mahasiswaModel.setNama(sNama);
                mahasiswaModel.setKelas(sKelas);
                mahasiswaModel.setTelepon(sTelepon);
                mahasiswaModel.setEmail(sEmail);
                mahasiswaModel.setLine(sLine);
                mahasiswaModel.setInstagram(sInstagram);

                realmHelper = new RealmHelper(realm);
                realmHelper.save(mahasiswaModel);

                Toast.makeText(TambahActivity.this, "Berhasil Disimpan!", Toast.LENGTH_SHORT).show();

                nim.setText("");
                nama.setText("");
                kelas.setText("");
                telepon.setText("");
                email.setText("");
                line.setText("");
                instagram.setText("");
            }else {
                Toast.makeText(TambahActivity.this, "Terdapat inputan yang kosong", Toast.LENGTH_SHORT).show();
            }
        }else if (v == btnTampil){
            startActivity(new Intent(TambahActivity.this, MahasiswaActivity.class));
        }
    }
}

