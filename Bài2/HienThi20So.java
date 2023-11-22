import java.util.Scanner;

public class HienThi20So {
    public static void main(String[] args) {
        int n = 0;
        int a = 0;
        while (a < 20) {
            for (int m = 1; m < 100; m++) {
                for (int j = 1; j <= m; j++) {
                    if (m % j == 0) {
                        n += 1;
                    }
                }
                if (n == 2) {
                    System.out.println(m);
                    n = 0;
                }
                n = 0;
                a++;
//                else if (n != 2) {
//                    System.out.println("Không phải số nguyên tố");
//                }
            }

        }

    }
}

