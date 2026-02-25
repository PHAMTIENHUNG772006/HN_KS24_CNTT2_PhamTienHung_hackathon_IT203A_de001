package Cau3;

import java.util.Scanner;

public class BaiKho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, m;

        System.out.println("nhập số lượng phần tử mảng A : ");
        n = scanner.nextInt();

        int[] A = new int[n];


        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            A[i] = temp;
        }

        System.out.println("nhập số lượng phần tử mảng B : ");
        m = scanner.nextInt();

        int[] B = new int[m];

        for (int i = 0; i < m; i++) {
            int temp = scanner.nextInt();
            B[i] = temp;
        }

        int count = 0;


        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (B[j] == A[i]){
                    count++;
                }
            }
        }

        if (count == B.length){
            System.out.println("Mảng B là mảng con của A");
        }else {
            System.out.println("Mảng B không phải là mảng con của A");
        }
    }
}
