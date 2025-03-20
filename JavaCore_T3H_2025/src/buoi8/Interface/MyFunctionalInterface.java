package buoi8.Interface;

@FunctionalInterface
public interface MyFunctionalInterface {
    public int congHaiSo(int a, int b);

    default void congHai(int a, int b) {

    };
}
