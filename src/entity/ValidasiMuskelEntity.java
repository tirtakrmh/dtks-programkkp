package entity;

import java.util.Objects;

public class ValidasiMuskelEntity {
    private int id;
    private String keterangan;
    private String alasan;
    private String nikPendaftar;
    private int noPegawai;
    private int idMuskel;

    public ValidasiMuskelEntity() {
    }

    public ValidasiMuskelEntity(int id, String keterangan, String alasan, String nikPendaftar, int noPegawai, int idMuskel) {
        this.id = id;
        this.keterangan = keterangan;
        this.alasan = alasan;
        this.nikPendaftar = nikPendaftar;
        this.noPegawai = noPegawai;
        this.idMuskel = idMuskel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }

    public String getNikPendaftar() {
        return nikPendaftar;
    }

    public void setNikPendaftar(String nikPendaftar) {
        this.nikPendaftar = nikPendaftar;
    }

    public int getNoPegawai() {
        return noPegawai;
    }

    public void setNoPegawai(int noPegawai) {
        this.noPegawai = noPegawai;
    }

    public int getIdMuskel() {
        return idMuskel;
    }

    public void setIdMuskel(int idMuskel) {
        this.idMuskel = idMuskel;
    }

    @Override
    public String toString() {
        return "ValidasiMuskelEntity{" + "id=" + id + ", keterangan=" + keterangan + ", alasan=" + alasan + ", nikPendaftar=" + nikPendaftar + ", noPegawai=" + noPegawai + ", idMuskel=" + idMuskel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.nikPendaftar);
        hash = 59 * hash + this.idMuskel;
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
        final ValidasiMuskelEntity other = (ValidasiMuskelEntity) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idMuskel != other.idMuskel) {
            return false;
        }
        return Objects.equals(this.nikPendaftar, other.nikPendaftar);
    }
    
    
}
