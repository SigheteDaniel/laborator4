package ex1;

public class SistemeDeCalcul {

    private String tip_mon;
    private int vit_proc;
    private int c_hdd;
    private Sistem sistem;
    public SistemeDeCalcul(String tip,int viteza,int capacitate,Sistem sist){

        this.tip_mon=tip;
        this.vit_proc=viteza;
        this.c_hdd=capacitate;
        this.sistem=sist;
    }

    public String getTip_mon() {
        return tip_mon;
    }

    public int getVit_proc() {
        return vit_proc;
    }

    public int getC_hdd() {
        return c_hdd;
    }

    public Sistem getSistem() {
        return sistem;
    }

    public void setTip_mon(String tip_mon) {
        this.tip_mon = tip_mon;
    }

    public void setVit_proc(int vit_proc) {
        this.vit_proc = vit_proc;
    }

    public void setC_hdd(int c_hdd) {
        this.c_hdd = c_hdd;
    }

    public void setSistem(Sistem sistem) {
        this.sistem = sistem;
    }

    @Override
    public String toString() {
        return "SistemeDeCalcul{" +
                "tip_mon='" + tip_mon + '\'' +
                ", vit_proc=" + vit_proc +
                ", c_hdd=" + c_hdd +
                ", sistem=" + sistem +
                '}';
    }
}
