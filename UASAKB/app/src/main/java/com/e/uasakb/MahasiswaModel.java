package com.e.uasakb;

//Taggal : 1-8-2019
//10116116
//Ammar Rifqul Abrar
//AKB-3

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class MahasiswaModel extends RealmObject {

    @PrimaryKey
    private Integer id;
    private Integer nim;
    private String nama;
    private String kelas;
    private Integer telepon;
    private String email;
    private String line;
    private String instagram;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNim(Integer nim) {
        this.nim = nim;
    }

    public Integer getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKelas (String kelas) {
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setTelepon(Integer telepon) {
        this.telepon = telepon;
    }

    public Integer getTelepon() {
        return telepon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String  getEmail () {
        return email;
    }

    public  void setLine(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getInstagram() {
        return instagram;
    }
}

