package ex1;

public class echipamente {
    private String nume;
    private int nr_inv;
    private int pret;
    private String zona_mag;
    private Stare stiuatie;

    public echipamente(String nume, int nr_inv, int pret, String zona_mag, Stare stiuatie) {
        this.nume = nume;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.stiuatie = stiuatie;
    }

    public String getNume() {
        return nume;
    }

    public int getNr_inv() {
        return nr_inv;
    }

    public int getPret() {
        return pret;
    }

    public String getZona_mag() {
        return zona_mag;
    }

    public Stare getStiuatie() {
        return stiuatie;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNr_inv(int nr_inv) {
        this.nr_inv = nr_inv;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void setZona_mag(String zona_mag) {
        this.zona_mag = zona_mag;
    }

    public void setStiuatie(Stare stiuatie) {
        this.stiuatie = stiuatie;
    }

    @Override
    public String toString() {
        return "echipamente{" +
                "nume='" + nume + '\'' +
                ", nr_inv=" + nr_inv +
                ", pret=" + pret +
                ", zona_mag='" + zona_mag + '\'' +
                ", stiuatie=" + stiuatie +
                '}';
    }
}
