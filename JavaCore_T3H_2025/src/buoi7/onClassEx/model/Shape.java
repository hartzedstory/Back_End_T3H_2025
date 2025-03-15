package buoi7.onClassEx.model;

public class Shape {

    public Shape() {
    }

    public Shape(int numberOfAngles, String tenHinhNeuCo) {
        this.numberOfAngles = numberOfAngles;
        this.tenHinhNeuCo = tenHinhNeuCo;
    }

    private int numberOfAngles;
    private String tenHinhNeuCo;

    public void hienThiThongTin() {
        System.out.println("Tên của hình: " + this.getTenHinhNeuCo());
    }
    public int getNumberOfAngles() {
        return numberOfAngles;
    }

    public void setNumberOfAngles(int numberOfAngles) {
        this.numberOfAngles = numberOfAngles;
    }

    public String getTenHinhNeuCo() {
        return tenHinhNeuCo;
    }

    public void setTenHinhNeuCo(String tenHinhNeuCo) {
        this.tenHinhNeuCo = tenHinhNeuCo;
    }
}
