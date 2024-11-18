
package btvn.buoi5;

import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;
    protected Address address;
    
    public Person() {
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ten: ");
        this.name = sc.nextLine();
        
        System.out.print("Nhap tuoi: ");
        this.age = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Nhap dia chi: ");
        Address address = new Address();
        address.input();
        this.address = address;
    }

    public void output() {
        System.out.printf("%-20s %-20d ", name, age);
        address.output();
    }
}
