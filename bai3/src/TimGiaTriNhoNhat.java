import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo mảng số nguyên
        final int SIZE = 5; // Kích thước mảng
        int[] numbers = new int[SIZE];

        // Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
        System.out.println("Nhập giá trị cho các phần tử trong mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Bước 3: Gán phần tử đầu tiên là giá trị nhỏ nhất
        int minValue = numbers[0];

        // Bước 4: Duyệt mảng từ phần tử thứ 2 đến hết mảng
        for (int i = 1; i < SIZE; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }

        // Bước 5: In ra giá trị nhỏ nhất
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
    }
    }

