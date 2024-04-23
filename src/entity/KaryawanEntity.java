package entity;

import java.util.Objects;

public class KaryawanEntity {
    private int noPegawai;
    private String nama;
    private String role;
    private String username;
    private String password;
    private String noHp;
    private String email;
    private String tempatTugas;
    private String alamat;

    public KaryawanEntity() {
    }

    public KaryawanEntity(int noPegawai, String nama, String role, String username, String password, String noHp, String email, String tempatTugas, String alamat) {
        this.noPegawai = noPegawai;
        this.nama = nama;
        this.role = role;
        this.username = username;
        this.password = password;
        this.noHp = noHp;
        this.email = email;
        this.tempatTugas = tempatTugas;
        this.alamat = alamat;
    }

    public int getNoPegawai() {
        return noPegawai;
    }

    public void setNoPegawai(int noPegawai) {
        this.noPegawai = noPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTempatTugas() {
        return tempatTugas;
    }

    public void setTempatTugas(String tempatTugas) {
        this.tempatTugas = tempatTugas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    

}
