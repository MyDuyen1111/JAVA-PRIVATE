
package baikt1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap x: ");
        float x = scanner.nextFloat();
        System.out.println("Nhap y: ");
        int y = scanner.nextInt();
        System.out.println("x mu y = " + Math.pow(x,y));
    }
}
