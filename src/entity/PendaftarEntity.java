package entity;

import java.util.Date;
import java.util.Objects;

public class PendaftarEntity {
    private String nik;
    private String namaLengkap;
    private String statusKeluarga;
    private Date tanggalLahir;
    private String statusKawin;
    private String namaIbu;
    private String jenisKelamin;
    private String statusKerja;
    private String alamat;
    private int rt;
    private int rw;
    private String provinsi;
    private String kabupaten;
    private String kecamatan;
    private String kelurahan;
    private String agama;
    private String pendidikan;
    private String golDar;
    private String statusHubungan;
    private String kewarganegaraan;
    private String namaAyah;
    private String noHp;
    private String disabilitas;
    private int rtDomisili;
    private int rwDomisili;
    private String provinsiDomisili;
    private String kecamatanDomisili;
    private String kelurahanDomisili;
    private String mobil;
    private String njop;
    private String sumberAir;
    private int penghasilan;
    private int idUser;

    public PendaftarEntity() {
    }

    public PendaftarEntity(String nik, String namaLengkap, String statusKeluarga, Date tanggalLahir, String statusKawin, String namaIbu, String jenisKelamin, String statusKerja, String alamat, int rt, int rw, String provinsi, String kabupaten, String kecamatan, String kelurahan, String agama, String pendidikan, String golDar, String statusHubungan, String kewarganegaraan, String namaAyah, String noHp, String disabilitas, int rtDomisili, int rwDomisili, String provinsiDomisili, String kecamatanDomisili, String kelurahanDomisili, String mobil, String njop, String sumberAir, int penghasilan, int idUser) {
        this.nik = nik;
        this.namaLengkap = namaLengkap;
        this.statusKeluarga = statusKeluarga;
        this.tanggalLahir = tanggalLahir;
        this.statusKawin = statusKawin;
        this.namaIbu = namaIbu;
        this.jenisKelamin = jenisKelamin;
        this.statusKerja = statusKerja;
        this.alamat = alamat;
        this.rt = rt;
        this.rw = rw;
        this.provinsi = provinsi;
        this.kabupaten = kabupaten;
        this.kecamatan = kecamatan;
        this.kelurahan = kelurahan;
        this.agama = agama;
        this.pendidikan = pendidikan;
        this.golDar = golDar;
        this.statusHubungan = statusHubungan;
        this.kewarganegaraan = kewarganegaraan;
        this.namaAyah = namaAyah;
        this.noHp = noHp;
        this.disabilitas = disabilitas;
        this.rtDomisili = rtDomisili;
        this.rwDomisili = rwDomisili;
        this.provinsiDomisili = provinsiDomisili;
        this.kecamatanDomisili = kecamatanDomisili;
        this.kelurahanDomisili = kelurahanDomisili;
        this.mobil = mobil;
        this.njop = njop;
        this.sumberAir = sumberAir;
        this.penghasilan = penghasilan;
        this.idUser = idUser;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getStatusKeluarga() {
        return statusKeluarga;
    }

    public void setStatusKeluarga(String statusKeluarga) {
        this.statusKeluarga = statusKeluarga;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getStatusKawin() {
        return statusKawin;
    }

    public void setStatusKawin(String statusKawin) {
        this.statusKawin = statusKawin;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getStatusKerja() {
        return statusKerja;
    }

    public void setStatusKerja(String statusKerja) {
        this.statusKerja = statusKerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getRt() {
        return rt;
    }

    public void setRt(int rt) {
        this.rt = rt;
    }

    public int getRw() {
        return rw;
    }

    public void setRw(int rw) {
        this.rw = rw;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getGolDar() {
        return golDar;
    }

    public void setGolDar(String golDar) {
        this.golDar = golDar;
    }

    public String getStatusHubungan() {
        return statusHubungan;
    }

    public void setStatusHubungan(String statusHubungan) {
        this.statusHubungan = statusHubungan;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah) {
        this.namaAyah = namaAyah;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getDisabilitas() {
        return disabilitas;
    }

    public void setDisabilitas(String disabilitas) {
        this.disabilitas = disabilitas;
    }

    public int getRtDomisili() {
        return rtDomisili;
    }

    public void setRtDomisili(int rtDomisili) {
        this.rtDomisili = rtDomisili;
    }

    public int getRwDomisili() {
        return rwDomisili;
    }

    public void setRwDomisili(int rwDomisili) {
        this.rwDomisili = rwDomisili;
    }

    public String getProvinsiDomisili() {
        return provinsiDomisili;
    }

    public void setProvinsiDomisili(String provinsiDomisili) {
        this.provinsiDomisili = provinsiDomisili;
    }

    public String getKecamatanDomisili() {
        return kecamatanDomisili;
    }

    public void setKecamatanDomisili(String kecamatanDomisili) {
        this.kecamatanDomisili = kecamatanDomisili;
    }

    public String getKelurahanDomisili() {
        return kelurahanDomisili;
    }

    public void setKelurahanDomisili(String kelurahanDomisili) {
        this.kelurahanDomisili = kelurahanDomisili;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public String getNjop() {
        return njop;
    }

    public void setNjop(String njop) {
        this.njop = njop;
    }

    public String getSumberAir() {
        return sumberAir;
    }

    public void setSumberAir(String sumberAir) {
        this.sumberAir = sumberAir;
    }

    public int getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(int penghasilan) {
        this.penghasilan = penghasilan;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "PendaftarEntity{" + "nik=" + nik + ", namaLengkap=" + namaLengkap + ", statusKeluarga=" + statusKeluarga + ", tanggalLahir=" + tanggalLahir + ", statusKawin=" + statusKawin + ", namaIbu=" + namaIbu + ", jenisKelamin=" + jenisKelamin + ", statusKerja=" + statusKerja + ", alamat=" + alamat + ", rt=" + rt + ", rw=" + rw + ", provinsi=" + provinsi + ", kabupaten=" + kabupaten + ", kecamatan=" + kecamatan + ", kelurahan=" + kelurahan + ", agama=" + agama + ", pendidikan=" + pendidikan + ", golDar=" + golDar + ", statusHubungan=" + statusHubungan + ", kewarganegaraan=" + kewarganegaraan + ", namaAyah=" + namaAyah + ", noHp=" + noHp + ", disabilitas=" + disabilitas + ", rtDomisili=" + rtDomisili + ", rwDomisili=" + rwDomisili + ", provinsiDomisili=" + provinsiDomisili + ", kecamatanDomisili=" + kecamatanDomisili + ", kelurahanDomisili=" + kelurahanDomisili + ", mobil=" + mobil + ", njop=" + njop + ", sumberAir=" + sumberAir + ", penghasilan=" + penghasilan + ", idUser=" + idUser + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nik);
        hash = 79 * hash + Objects.hashCode(this.namaLengkap);
        hash = 79 * hash + Objects.hashCode(this.namaIbu);
        hash = 79 * hash + Objects.hashCode(this.kewarganegaraan);
        hash = 79 * hash + Objects.hashCode(this.namaAyah);
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
        final PendaftarEntity other = (PendaftarEntity) obj;
        if (!Objects.equals(this.nik, other.nik)) {
            return false;
        }
        if (!Objects.equals(this.namaLengkap, other.namaLengkap)) {
            return false;
        }
        if (!Objects.equals(this.namaIbu, other.namaIbu)) {
            return false;
        }
        if (!Objects.equals(this.kewarganegaraan, other.kewarganegaraan)) {
            return false;
        }
        return Objects.equals(this.namaAyah, other.namaAyah);
    }
    
    
}
