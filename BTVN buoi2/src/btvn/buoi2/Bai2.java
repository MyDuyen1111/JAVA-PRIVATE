//
//package btvn.buoi2;
//
//import java.util.Scanner;
//
//public class Bai2 {
//    
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Nhap n: ");
//        int n = scanner.nextInt();
//        
//        int arr[] = new int[n];
//        System.out.println("Nhap mang: ");
//        for (int i = 0; i < n; i++ ) {
//            arr[i] = scanner.nextInt();
//        }
//        
//        System.out.println("Nhap k: ");
//        int k = scanner.nextInt();
//        
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//        
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];
//            
//            if (i >= k - 1) {
//                max = Math.max (max,sum);           
//                sum -= arr[i - (k-1)];
//            }                
//        }
//        
//        System.out.println(max);
//        scanner.close();
//    }
//}
