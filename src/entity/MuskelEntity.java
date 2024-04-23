package entity;

import java.util.Date;
import java.util.Objects;

public class MuskelEntity {
    private int id;
    private String nama;
    private Date tanggalMulai;
    private Date tanggalAkhir;
    private String dana;

    public MuskelEntity() {
    }

    public MuskelEntity(int id, String nama, Date tanggalMulai, Date tanggalAkhir, String dana) {
        this.id = id;
        this.nama = nama;
        this.tanggalMulai = tanggalMulai;
        this.tanggalAkhir = tanggalAkhir;
        this.dana = dana;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(Date tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public Date getTanggalAkhir() {
        return tanggalAkhir;
    }

    public void setTanggalAkhir(Date tanggalAkhir) {
        this.tanggalAkhir = tanggalAkhir;
    }

    public String getDana() {
        return dana;
    }

    public void setDana(String dana) {
        this.dana = dana;
    }

    @Override
    public String toString() {
        return "MuskelEntity{" + "id=" + id + ", nama=" + nama + ", tanggalMulai=" + tanggalMulai + ", tanggalAkhir=" + tanggalAkhir + ", dana=" + dana + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.nama);
        hash = 67 * hash + Objects.hashCode(this.tanggalMulai);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MuskelEntity other = (MuskelEntity) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        return Objects.equals(this.tanggalMulai, other.tanggalMulai);
    }
    
    
}
