package Cau1;

import java.util.Scanner;

public class Bai2 {
    // tạo hàm check để kiểm tra xem đã có trong mảng check chưa tránh trùng lặp
    public static boolean isCheck(char[] strings, char c) {
        for (char ch : strings) {
            if (ch == c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Nhập nôi dung :");
        input = scanner.nextLine();
        // kiểm tra trống
        if (input.trim() == "") {
            System.out.println("Lỗi không nhập nội dung ");
            return;
        }
        char[] temp = new char[100];
        int index = 0;

        for (char c1 : input.toCharArray()) {
            int count = 0;
            for (char c2 : input.toCharArray()) {
                if (c1 == c2) {
                    count++;
                }
            }
            // nếu trùng thì bỏ qua
            if (isCheck(temp,c1)){
                continue;
            }else {
                temp[index++] = c1;
                System.out.println(c1 + " : " + count);
            }
        }

    }
}
