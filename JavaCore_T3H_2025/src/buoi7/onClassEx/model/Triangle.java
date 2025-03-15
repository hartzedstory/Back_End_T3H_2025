package buoi7.onClassEx.model;

public class Triangle extends Poygonal {
    public Triangle() {
    }

    public Triangle(String borderColor) {
        this.borderColor = borderColor;
    }

    public Triangle(int numberOfSides, String borderColor) {
        super(numberOfSides);
        this.borderColor = borderColor;
    }

    public Triangle(int numberOfAngles, String tenHinhNeuCo, int numberOfSides, String borderColor) {
        super(numberOfAngles, tenHinhNeuCo, numberOfSides);
        this.borderColor = borderColor;
    }

    private String borderColor;
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Màu viền: " + this.getBorderColor());
    }
    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
}
