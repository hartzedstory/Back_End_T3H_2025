package buoi7;
/*
  - Các thời điểm chạy:
    - Compile time: Khi biên dịch code
    - Run time: Khi ứng dụng chạy

    - Override phương thức
        + Xảy ra tại 2 class có mqh kế thừa
        + Khi class con tồn tại 1 method giống hệt
         + => method tại subclass ược gọi là override method

        + Override method được sử dụng khi subclass muốn viết lại
        môột hành động / phương thức của superclass

        +super:
         + Tương tự từ khóa this. Nhưng được sử dụng đ gọi tới các thuộc tính của superclass
          để sử dụng trong subclass

        +instanceOf:
            + Kieerm tra xem object của superclass tại thời điểm runtime
            có phải là instance ( được khởi tạo bằng từ khóa new subclass không)
             --> Nếu true ==> cho phe
 */
public class Main {
    public static void main(String[] args) {

        //Khai báo subclass khởi tạo subclass: Có thể truy cập tới các props con và cha
        Bicycle xeDap1 = new Bicycle();
        xeDap1.setMauSac("Đỏ");
        xeDap1.setTen("Thống nhất");
        xeDap1.setSoLuongBanh("2");
        xeDap1.setNamSanXuat(2024);
        xeDap1.setLoaiXich("Xich vip");

        // Khai báo bằng superclass và khởi tạo bằng subclass: chỉ có th truy cập tới các props của cha

        Vehicle xeDap2 = new Bicycle();
        // Nếu muốn truy cập tới các thuộc tính và method của subclass ->> ép kiểu sang kiểu subclass
        xeDap2.setMauSac("Đỏ");
        xeDap2.setTen("Thống nhất");
        xeDap2.setSoLuongBanh("2");
        xeDap2.setNamSanXuat(2024);
        ((Bicycle) xeDap2).setLoaiXich("Xich Thống Nhaats");
        // Ngoài cách trên, còn có thể dùng instanceOf
        if (xeDap2 instanceof Bicycle) {
            ((Bicycle) xeDap2).setLoaiXich("Xich Thống Nhất 2");
        }


        xeDap1.hienThiThongTin();
        xeDap2.hienThiThongTin();


        Motobike xeMay1 = new Motobike();
        Vehicle xeMay2 = new Motobike();

        Car xeOto1 = new Car();
        Vehicle xeOto2 = new Car();
    }
}
