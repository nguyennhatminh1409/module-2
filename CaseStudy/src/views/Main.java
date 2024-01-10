package views;

import controller.EmployeeController;
import controller.MenulController;
import model.Employee;
import model.FullTimeEmployee;
import model.MenuItem;

import java.util.List;
import java.util.Scanner;

public class Main {
//    public static List<MenuItem> menuItemList = MenulController.menuItemList;

    public static void main(String[] args) {
        System.out.println(MenulController.menuItemList);
        MenuItem menuItem = createNewMenuItems();
        MenulController.addNewMenuItems(menuItem);
        System.out.println(MenulController.menuItemList);
    }

    //Tạo mới món ăn
    public static MenuItem createNewMenuItems() {
        // name, price, category
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên món ăn");
        String name = sc.nextLine();
        System.out.println("Mời bạn nhập giá của món ăn");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println("Mời bạn nhập loại món ăn");
        String category = sc.nextLine();
        System.out.println("Nhập 1 là loại đồ ăn");
        System.out.println("Nhập 2 là loại nước uống");
        MenuItem a = new MenuItem(name, price, category);
        int type = sc.nextInt();
        switch (type) {
            case 1:
                return a;
        }
        return null;
    }
}
