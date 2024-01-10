package controller;



import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
    public static List<Employee> employeeList = new ArrayList<>();

    public void addNewEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void deleteById(int index) {
        employeeList.remove(index);
    }

    public EmployeeController() {
    }

    public EmployeeController(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
