
package btvn.buoi2;

import java.util.Scanner;

public class Bai1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Nhap mang: ");
        for (int i = 0; i < n; i++ ) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Nhap k: ");
        int k = scanner.nextInt();
        
        int left = 0, right = n-1, result = -1;
        while (left <= right) {
            int mid = (left + right)/ 2;
            if (arr[mid] == k) {
                result = mid;
                break;
            }
            else if (arr[mid] > k)
                right = mid - 1;
            else
               left = mid + 1;
        }
        System.out.println(result);
        scanner.close();
    }
    
}
