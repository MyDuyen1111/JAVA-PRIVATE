
package btvn.buoi1;

import java.util.Scanner;

public class Bai2 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Nhap mot so nguyen: ");
        int number = scanner.nextInt();
        int tich = 1;
        
        while (number > 0) {
            int d = number % 10;
            tich *= d;
            number /= 10;
        }
        
        System.out.println("Tich cac chu so cua so vua nhap: " + tich);
        
        scanner.close();
    }
}
