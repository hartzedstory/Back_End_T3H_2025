package buoi1;

public class Main {
    public static void main(String[] args) {
        int[] arrayTemp = {12,5442,123,543,1223,11,0,5412,123};

        // Tìm kiếm nổi bọt
        for (int i = 0; i < arrayTemp.length - 1; i++) {
            for (int j = 0; j < arrayTemp.length - 1 - i; j++) {
                if (arrayTemp[j] > arrayTemp[j+1]) {
                    //Luu so lon hon do lai
                    int temp = arrayTemp[j];
                    arrayTemp[j] = arrayTemp[j+1];
                    arrayTemp[j+1] = temp;
                }
            }
        }
        System.out.println(arrayTemp);
    }
}
