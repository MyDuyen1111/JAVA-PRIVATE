
package btvn.buoi3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ma sinh vien: ");
        String studentCode = scanner.nextLine();
        
        System.out.print("Ho ten: ");
        String fullName = scanner.nextLine();
        
        System.out.print("Tuoi: ");
	byte age = scanner.nextByte();
        scanner.nextLine();
        
        System.out.print("Gioi tinh: ");
        String gender = scanner.nextLine();
        
        System.out.print("So dien thoai: ");
        String phoneNumber = scanner.nextLine();
        
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        Student student = new Student(studentCode, fullName, age, gender, phoneNumber, email);
        
        student.display();
        
        scanner.close();
    }
}
