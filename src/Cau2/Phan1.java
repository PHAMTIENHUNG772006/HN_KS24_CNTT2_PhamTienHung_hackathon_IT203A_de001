package Cau2;

import java.util.Scanner;

public class Phan1 {
    // tạo hàm check để kiểm tra xem đã có trong mảng check chưa tránh trùng lặp
    public static boolean isCheck(int[] arr, int value) {
        for (int a : arr) {
            if (a == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("nhập số lượng phần tử : ");
        n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            array[i] = temp;
        }

        int[] temp = new int[n];
        int index = 0;


        for (int i = 0; i < index; i++) {
            System.out.println(temp[i]);
        }


        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            // nếu trùng thì bỏ qua chưa có thì thêm vào temp để check trùng lặp
            if (isCheck(temp, array[i])) {
                continue;
            } else {
                temp[index] = array[i];
                index++;
                System.out.printf("Số %d xuất hiện : %d lần \n", array[i], count);
            }
        }
    }
}
