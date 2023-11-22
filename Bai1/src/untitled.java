import java.util.Scanner;

public class untitled {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        //Displays a message to enter the USD amount
        System.out.println("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        Double quydoi= usd * 23000;
        //Displays a notice of the currency value converted to VND
        System.out.println("Giá trị VNĐ" + quydoi);
    }
}
