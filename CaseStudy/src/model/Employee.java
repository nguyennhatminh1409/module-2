package model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String phonenumber;
    private String email;
    //Contructer
    public Employee(int id, String name, int age, String phonenumber, String email){
        this.id = id;
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    public Employee() {
    }

    //Gán Getter và Setter cho các thuộc tính
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getPhonenumber(){
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber){
        this.phonenumber = phonenumber;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getPayment() {
        return 0;
    }
}
