package entity;

import java.util.Objects;

public class UserEntity {
    private int id;
    private String noKK;
    private String namaLengkap;
    private String email;
    private String noHp;
    private String password;

    public UserEntity() {
    }

    public UserEntity(int id, String noKK, String namaLengkap, String email, String noHp, String password) {
        this.id = id;
        this.noKK = noKK;
        this.namaLengkap = namaLengkap;
        this.email = email;
        this.noHp = noHp;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoKK() {
        return noKK;
    }

    public void setNoKK(String noKK) {
        this.noKK = noKK;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" + "id=" + id + ", noKK=" + noKK + ", namaLengkap=" + namaLengkap + ", email=" + email + ", noHp=" + noHp + ", password=" + password + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final UserEntity other = (UserEntity) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.noKK, other.noKK)) {
            return false;
        }
        if (!Objects.equals(this.namaLengkap, other.namaLengkap)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.noHp, other.noHp)) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }
    
    
}
