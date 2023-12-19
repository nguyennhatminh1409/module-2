import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị cho a:");
        double a = scanner.nextDouble();

        System.out.print("Nhập giá trị cho b:");
        double b = scanner.nextDouble();

        System.out.print("Nhập giá trị cho c:");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.print("Phương trình có 2 nghiệm:");
            System.out.print("Nghiệm 1: + root1");
            System.out.print("Nghiệm 2: + root2");
        }else if(discriminant == 0) {
            double root = equation.getRoot1();
            System.out.print("Phương trình có 1 nghiệm kép:");
            System.out.print("Nghệm: " + root);
        }else {
            System.out.print("Phương trình không có nghiệm:");
        }
    }
}