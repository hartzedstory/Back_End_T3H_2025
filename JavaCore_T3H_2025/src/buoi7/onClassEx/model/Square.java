package buoi7.onClassEx.model;


public class Square extends Retangle {

    public Square() {
    }

    public Square(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    public Square(String backgroundColor, int lengthOfSide) {
        super(backgroundColor);
        this.lengthOfSide = lengthOfSide;
    }

    public Square(int numberOfSides, String backgroundColor, int lengthOfSide) {
        super(numberOfSides, backgroundColor);
        this.lengthOfSide = lengthOfSide;
    }

    public Square(int numberOfAngles, String tenHinhNeuCo, int numberOfSides, String backgroundColor, int lengthOfSide) {
        super(numberOfAngles, tenHinhNeuCo, numberOfSides, backgroundColor);
        this.lengthOfSide = lengthOfSide;
    }

    private int lengthOfSide;
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Độ dài từng cạnh: " + this.getLengthOfSide());
    }

    public int getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }
}
