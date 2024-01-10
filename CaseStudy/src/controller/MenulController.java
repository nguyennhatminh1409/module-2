package controller;

import model.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenulController {
    public static List<MenuItem> menuItemList = new ArrayList<>();

    public static void addNewMenuItems(MenuItem menuItem) {
        menuItemList.add(menuItem);
    }

    public static void deleteById(int index) {
        menuItemList.remove(index);
    }

    public MenulController() {
    }

    public MenulController(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }
}
