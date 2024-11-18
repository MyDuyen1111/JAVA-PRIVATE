
package btvn.buoi5;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {
    
    private static ArrayList<Student> st = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static ClassRoom classroom = new ClassRoom();
    
    public void sortByGpa(ArrayList<Student> st) {
        st.sort(Comparator.comparing(Student::getGpa));
    }
    
    public void inputList(ArrayList<Student> st){
        Student student = new Student();
        do {
            student.input();
            st.add(student);
        }
        while (student.getId() != 555);
    }
    
    public void outputList(ArrayList<Student> st) {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s ", "ID", "TEN", "TUOI", "XA", "HUYEN", "TINH/THANH PHO", "LOP", "GPA");
        for (Student student : st) {
            student.output();
        }
        System.out.println("---------------------");
    }
    
    public void removeById(ArrayList<Student> st, int id) {        
        boolean check = false;
        
        for (Student student : st) {
            if (student.getId() == id) {
                st.remove(student);
                check = true;
                System.out.println("Xoa thanh cong.");
            }
        }
        
        if (!check)
            System.out.println("Khong tim thay sinh vien co id: " + id);
    }
    
    public static void main(String[] args) {
        int choice;
        
        do {
            System.out.println("\n-----MENU-----");
            System.out.println("1. Nhap thong tin");
            System.out.println("2. In thong tin");
            System.out.println("3. Sap xep theo gpa");
            System.out.println("4. Xoa sinh vien theo id");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    classroom.inputList(st);
                    break;
                case 2:
                    classroom.outputList(st);
                    break;
                case 3:
                    classroom.sortByGpa(st);
                    break;
                case 4:     
                    System.out.print("Nhap id can xoa: ");
                    int id = sc.nextInt();
                    sc.nextLine();                    
                    
                    classroom.removeById(st, id);
                    break;
                case 5: 
                    System.out.println("Thoat");
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai: ");
            }
        }
        while (choice > 5 || choice < 1);
        sc.close();
    }
}
