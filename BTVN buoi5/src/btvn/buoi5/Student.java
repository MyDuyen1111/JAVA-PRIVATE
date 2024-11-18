
package btvn.buoi5;

import java.util.Scanner;

public class Student extends Person{
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria = 2;
    
    public Student(){
    }

    public Student(int id, String nameClass, float gpa) {
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public Student(int id, String nameClass, float gpa, String name, int age, Address address) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
    public float getCriteria() {
        return criteria;
    }
    
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap id: ");
        this.id = sc.nextInt();
        sc.nextLine();
        
        super.input();
        
        System.out.print("Nhap ten lop: ");
        this.nameClass = sc.nextLine();
        
        System.out.print("Nhap gpa: ");
        this.gpa = sc.nextFloat();
        sc.nextLine();
    }
   
    @Override
    public void output() {
        System.out.printf("%-20d ", id);
        super.output();
        System.out.printf("%-20s %-20f ", nameClass, gpa);
    }
    
    public boolean checkFall() {
        boolean check = false;
        if (gpa < criteria)
            check = true;
        return check;
    }
}
