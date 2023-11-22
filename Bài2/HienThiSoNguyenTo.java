public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int i = 0;
        int a = 0;
            for (int m = 1; m < 100; m++) {
                for (int j = 1; j <= m; j++) {
                    if (m % j == 0) {
                        i += 1;
                    }
                }
                if (i == 2) {
                    System.out.println(m);
                    i = 0;
                }
                i = 0;
                a++;
            }
        }
    }

