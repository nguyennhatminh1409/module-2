package model;

import model.Employee;

public class ParttimeEmployee extends Employee {
    private double workHour;
    public ParttimeEmployee() {
    }
    public ParttimeEmployee(double workHour) {
        this.workHour = workHour;
    }
    public double getWorkHour() {
        return workHour;
    }
    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    @Override
    public double getPayment() {
        return workHour * 100000;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" +
                "workHour=" + workHour +
                '}';
    }
}
