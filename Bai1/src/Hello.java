import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //display message enter name
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            //Display hello message and name
            System.out.println("Hello:" + name);
    }
}
