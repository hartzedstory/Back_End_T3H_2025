package buoi8;

import buoi8.Interface.MyFunctionalInterface;

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface fI = new MyFunctionalInterface() {
            @Override
            public int congHaiSo(int a, int b) {
                return 0;
            }
        }; // Cách này khá dài dòng, nên chúng ta dùng lambda
        /*
        Lambda
        Cú pháp: (param1, param2, paramN) -> {expression}
         */

        MyFunctionalInterface fI2 = (a,b) -> a + b;
    }
}
