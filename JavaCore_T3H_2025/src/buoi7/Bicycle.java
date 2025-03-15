package buoi7;

public class Bicycle extends Vehicle {
    private String loaiXich;

    public void hienThiThongTin() {
        /*
        Thay vì phải viết lại hoàn toàn các thông tin của class
        --> sử dụng từ khóa super để gọi towis method của superclass để dùng lại

         */
        super.hienThiThongTin();
        System.out.println("Loại Xich: " + loaiXich);
    }
    public String getLoaiXich() {
        return loaiXich;
    }

    public void setLoaiXich(String loaiXich) {
        this.loaiXich = loaiXich;
    }
}
