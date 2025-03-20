package buoi8.onClasDemo;

public class OnClassDemoMain {
    public static void main(String[] args) {
        // cách 1: Annonymous class
        IMath math = new IMath() {
            @Override
            public int thuongHaiSo(int a, int b) {
                return 12 + 20;
            }
        };

        // cách 2: lamda
        IMath math2 = (soThuNhat,soThu2) -> {
            return 12 + 20;
        };
    }
}
