public class Hinhhoc {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
        }


        for (int x  = 0; x < 5; x++){
            System.out.println();
            for (int y = 0; y < x+1; y++){
                System.out.print("*");
            }

        }
        int a = 5;
        for (int m = 0; m < 5; m++){
            System.out.println();
            for (int t = 0; t < a; t++) {
                System.out.print("*");
            }
            a--;
        }
    }

}
