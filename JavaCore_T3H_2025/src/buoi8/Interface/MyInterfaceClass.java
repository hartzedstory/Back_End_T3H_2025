package buoi8.Interface;

public class MyInterfaceClass {
    public static void main(String[] args) {
        /*
        Cú pháp sai: MyInterface doituong1 = new MyInterfaceImplement ();
        Sai vif không thể tạo trực tiêếp đối tượng từ interface
        Neeus muoon khoi tao, bat buong phai tao ra doi tuong thong qua Class implement interface do
         */
        MyInterface doituong1 = new MyInterfaceImplement ();
        doituong1.method1();
        doituong1.method2();
        doituong1.method3();
    }
}
