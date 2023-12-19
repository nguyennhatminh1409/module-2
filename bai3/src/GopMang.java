import java.util.Arrays;
import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng 1: ");
        int size1 = scanner.nextInt();

        // Tạo mảng 1 với kích thước đã nhập
        int[] array1 = new int[size1];

        // Nhập giá trị cho mảng 1
        System.out.println("Nhập giá trị cho mảng 1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Phần tử thứ " + i + ": ");
            array1[i] = scanner.nextInt();
        }

        // Nhập kích thước mảng 2
        System.out.print("Nhập kích thước mảng 2: ");
        int size2 = scanner.nextInt();

        // Tạo mảng 2 với kích thước đã nhập
        int[] array2 = new int[size2];

        // Nhập giá trị cho mảng 2
        System.out.println("Nhập giá trị cho mảng 2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Phần tử thứ " + i + ": ");
            array2[i] = scanner.nextInt();
        }

        // Tạo mảng thứ 3 với kích thước là tổng kích thước của mảng 1 và mảng 2
        int[] array3 = new int[size1 + size2];

        // Gộp mảng 1 và mảng 2 vào mảng 3
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        // In mảng 3 sau khi gộp
        System.out.println("Mảng sau khi gộp:");
        System.out.println(Arrays.toString(array3));
    }
    }

