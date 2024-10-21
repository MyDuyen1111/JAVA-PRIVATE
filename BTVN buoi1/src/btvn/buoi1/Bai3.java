
package btvn.buoi1;

import java.util.Scanner;
import java.util.Arrays;

public class Bai3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
    
        int[] array = new int[5];
    
        System.out.println("Nhap 5 so nguyen: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap so " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        Arrays.sort(array);
        
        System.out.println("Hai so lon nhat la: " + array[3] + " va " + array[4]);
        
        scanner.close();
    }    
}
