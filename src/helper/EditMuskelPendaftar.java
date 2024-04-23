package helper;

import entity.MuskelEntity;

public class EditMuskelPendaftar {
    private String nama;
    private String nik;
    private String noKk;
    private String kelurahanDom;
    private MuskelEntity muskel;

    public EditMuskelPendaftar(String nama, String nik, String noKk, String kelurahanDom, MuskelEntity muskel) {
        this.nama = nama;
        this.nik = nik;
        this.noKk = noKk;
        this.kelurahanDom = kelurahanDom;
        this.muskel = muskel;
    }

    public MuskelEntity getMuskel() {
        return muskel;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNoKk() {
        return noKk;
    }

    public void setNoKk(String noKk) {
        this.noKk = noKk;
    }

    public String getKelurahanDom() {
        return kelurahanDom;
    }

    public void setKelurahanDom(String kelurahanDom) {
        this.kelurahanDom = kelurahanDom;
    }
    
    
}
