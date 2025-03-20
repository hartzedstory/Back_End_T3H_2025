package buoi8.Interface;

public class MyFunctionalInterfaceClass implements MyFunctionalInterface{
    @Override
    public int congHaiSo(int a, int b) {
        return 0;
    }

    @Override
    public void congHai(int a, int b) {
        MyFunctionalInterface.super.congHai(a, b);
    }
}
