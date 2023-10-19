package ex1;

public class Copiatoare {

    private int p_ton;
    private Format format;
    public Copiatoare(int p_t,Format form){

        this.p_ton=p_t;
        this.format=form;
    }

    public int getP_ton() {
        return p_ton;
    }

    public Format getFormat() {
        return format;
    }

    public void setP_ton(int p_ton) {
        this.p_ton = p_ton;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Copiatoare{" +
                "p_ton=" + p_ton +
                ", format=" + format +
                '}';
    }
}
