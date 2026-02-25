package Cau2;

import java.util.Scanner;

public class Phan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, k;

        System.out.println("nhập index k : ");
        k = scanner.nextInt();

        System.out.println("nhập số lượng phần tử : ");
        n = scanner.nextInt();

        int[] array = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            array[i] = temp;
        }

        int count = 0;
        boolean flag = false;
        int value = 0;


        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (array[i] == array[j]) {
                    flag = true;
                    value = array[i];
                    break;
                }
            }
            if (flag){
                break;
            }
        }

        if (flag){
            System.out.println("số tìm thấy : " + value);
        }else {
            System.out.println("không có trùng lặp");
        }
    }
}
