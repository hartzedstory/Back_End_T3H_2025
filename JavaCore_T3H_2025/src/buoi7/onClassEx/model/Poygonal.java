package buoi7.onClassEx.model;

public class Poygonal extends Shape {
    public Poygonal() {
    }

    public Poygonal(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public Poygonal(int numberOfAngles, String tenHinhNeuCo, int numberOfSides) {
        super(numberOfAngles, tenHinhNeuCo);
        this.numberOfSides = numberOfSides;
    }

    private int numberOfSides;

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số cạnh: " + this.getNumberOfSides());
    }
    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

}
