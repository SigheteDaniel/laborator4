package ex1;

public class imprimante extends echipamente{
    private int ppm;
    private String rezolutie;
    private int p_car;
    private mod mod_tiparire;

    public imprimante(String nume, int nr_inv, int pret, String zona_mag, Stare stiuatie, int ppm, String rezolutie, int p_car,mod m_t) {
        super(nume, nr_inv, pret, zona_mag, stiuatie);
        this.ppm = ppm;
        this.rezolutie = rezolutie;
        this.p_car = p_car;
        this.mod_tiparire = m_t;
    }

    public int getPpm() {
        return ppm;
    }

    public String getRezolutie() {
        return rezolutie;
    }

    public int getP_car() {
        return p_car;
    }

    public mod getMod_tiparire() {
        return mod_tiparire;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public void setRezolutie(String rezolutie) {
        this.rezolutie = rezolutie;
    }

    public void setP_car(int p_car) {
        this.p_car = p_car;
    }

    public void setMod_tiparire(mod mod_tiparire) {
        this.mod_tiparire = mod_tiparire;
    }


    @Override
    public String toString() {
        return "imprimante{" +
                "ppm=" + ppm +
                ", rezolutie='" + rezolutie + '\'' +
                ", p_car=" + p_car +
                ", mod_tiparire=" + mod_tiparire +
                '}';
    }
}


