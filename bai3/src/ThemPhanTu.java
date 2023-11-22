import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 0, 2, 0, 1, 0}; // Mảng cho trước
        int X = 3; // Số cần chèn
        int index = 4; // Vị trí cần chèn X vào

        // Dịch chuyển các phần tử sang phải từ vị trí cuối cùng đến vị trí index
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }

        // Chèn X vào vị trí index
        array[index] = X;

        System.out.println("Mảng sau khi chèn phần tử X:");
        System.out.println(Arrays.toString(array));
    }
}
