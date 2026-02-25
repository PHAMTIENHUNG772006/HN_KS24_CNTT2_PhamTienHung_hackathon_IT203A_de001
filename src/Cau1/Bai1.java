package Cau1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input ;

        System.out.println("Nhập nôi dung :");
        input = scanner.nextLine();
        // kiểm tra trống
        if (input.trim() == ""){
            System.out.println("Lỗi không nhập nội dung ");
            return;
        }
        int[] array = new int[100];
        int count = 0, sum = 0;
        for (char c : input.toCharArray()){
            if (Character.isLetter(c)){
                continue;
            }
            int temp = Integer.parseInt(String.valueOf(c));

            array[count++] = temp;
        }

        for (int i = 0; i < count; i++) {
            sum += array[i];
        }

        System.out.println(sum);
    }
}
