public class Notebook {
    private int ozu;
    private int hardDisc;
    private String os;
    private String color;

    public Integer getOzu() {
        return ozu;
    }

    public void setOzu(Integer ozu) {
        this.ozu = ozu;
    }

    public Integer getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(Integer hardDisc) {
        this.hardDisc = hardDisc;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ozu :" + ozu + ", hardDisc :" + hardDisc + ",OS :" + os + ", Color :" + color;
    }
}
