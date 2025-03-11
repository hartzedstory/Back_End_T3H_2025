package buoi5;

// Cu phap de khai bao class
public class Car {
    public String mauSac;
    public int namSanXuat;
    public String ten;

    //Khai bao constructor - dung de khoi tao doi tuong
    // - Constructor luon duoc goi dau tien khi khoi tao object

    public Car() { // Ham khoi tao khong tham so
        System.out.println("Constructor duoc khoi tao");
    }

    public Car(String mauSac, int namSanXuat, String ten) { //Ham khoi tao co tham so
        this.mauSac = mauSac;
        this.namSanXuat = namSanXuat;
        this.ten = ten;
    }

    // Khai bao cac phuong thuc can co cua class
    public void run() {
        System.out.println("Xe " + ten + " dang chay");
    }

    public void getInfor() {
        System.out.println("Ten xe: " + ten);
        System.out.println("Mau sac: " + mauSac);
        System.out.println("Nam san xuat: " + namSanXuat);
    }
}
