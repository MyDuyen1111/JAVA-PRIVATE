
package btvn.buoi1;

import java.util.Scanner;


public class Bai1 {
    
    public static String doi (int number, int heSo) {
        String result = "";
        
        do {
            int du = number % heSo;
            
            if (du < 10) {
                result += du;
            }
            else {
                result += (char) ('A' + (du - 10));
            }
            
            number /= heSo;
        }
        while (number > 0);
        
        StringBuilder str = new StringBuilder(result);
        
        return str.reverse().toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap mot so tu nhien: ");
        int number = scanner.nextInt();
        
        System.out.println("Nhap he so b (2 <= b <= 16): ");
        int heSo = scanner.nextInt();
        
        System.out.println("So " + number + " chuyen sang he " + heSo + " la: " + doi(number, heSo));
        
        scanner.close();
    }
}
