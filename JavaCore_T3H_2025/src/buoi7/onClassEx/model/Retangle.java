package buoi7.onClassEx.model;

public class Retangle extends Poygonal {

    public Retangle() {
    }

    public Retangle(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Retangle(int numberOfSides, String backgroundColor) {
        super(numberOfSides);
        this.backgroundColor = backgroundColor;
    }

    public Retangle(int numberOfAngles, String tenHinhNeuCo, int numberOfSides, String backgroundColor) {
        super(numberOfAngles, tenHinhNeuCo, numberOfSides);
        this.backgroundColor = backgroundColor;
    }


    private String backgroundColor;

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Màu nền: " + this.getBackgroundColor());
    }
    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
