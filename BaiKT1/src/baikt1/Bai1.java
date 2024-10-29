
package baikt1;

import java.util.Scanner;

public class Bai1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap so nguyen: ");
        int number = scanner.nextInt();
            
        int dv = number % 10;
        int chuc = (number / 10) % 10;
        int tram = number / 100;
        
        switch (tram) {
            case 0:
                break;
            case 1:
                System.out.print("mot tram ");
                break;
            case 2: 
                System.out.print("hai tram ");
                break;
            case 3: 
                System.out.print("ba tram ");
                break;
            case 4: 
                System.out.print("bon tram ");
                break;
            case 5: 
                System.out.print("nam tram ");
                break;
            case 6: 
                System.out.print("sau tram ");
                break;
            case 7: 
                System.out.print("bay tram ");
                break;
            case 8: 
                System.out.print("tam tram ");
                break;    
            default: 
                System.out.print("chin tram ");                                   
        }
        switch (chuc) {
            case 0:
                break;
            case 1:
                System.out.print("muoi ");
                break;
            case 2:
                System.out.print("hai muoi ");
                break;
            case 3:
                System.out.print("ba muoi ");
                break;
            case 4:
                System.out.print("bon muoi ");
                break;
            case 5:
                System.out.print("nam muoi ");
                break;
            case 6:
                System.out.print("sau muoi ");
                break;
            case 7:
                System.out.print("bay muoi ");
                break;
            case 8:
                System.out.print("tam muoi ");
                break;
            default:
                System.out.print("chin muoi ");        
        }
        switch (dv) {
            case 0:
                break;
            case 1:
                System.out.print("mot ");
                break;
            case 2:
                System.out.print("hai ");
                break;
            case 3:
                System.out.print("ba ");
                break;
            case 4:
                System.out.print("bon ");
                break;
            case 5:
                System.out.print("nam ");
                break;
            case 6:
                System.out.print("sau ");
                break;
            case 7:
                System.out.print("bay ");
                break;
            case 8:
                System.out.print("tam ");
                break;
            default:
                System.out.print("chin ");           
        }
        scanner.close();
    }
}
