package buoi8.Interface;

/* Khai báo class triển khai interface
- Khi có một class impleent interface
--> Class đó phải ghi đề (@override) tât cả các method cuủa interface đó

Tương tự với extension class trong Swift. Thay vi khoi tao cùng file. Giờ tách ra 1 class Implement rieng
*/
public class MyInterfaceImplement implements MyInterface {

    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }
}
