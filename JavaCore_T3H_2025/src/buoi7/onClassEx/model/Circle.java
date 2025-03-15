package buoi7.onClassEx.model;

public class Circle extends Shape {
    public Circle() {
    }

    public Circle(int numberOfAngles, String tenHinhNeuCo) {
        super(numberOfAngles, tenHinhNeuCo);
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Hình tròn không có góc - DEFAULT");
    }
}
