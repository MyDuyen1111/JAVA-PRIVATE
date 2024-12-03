
package UI;

import java.util.Scanner;
import java.util.ArrayList;

import model.Role;
import model.Account;
import model.Status;

import service.AuthServiceImpl;
import service.AccountServiceImpl;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthServiceImpl account = new AuthServiceImpl();
        AccountServiceImpl accountList = new AccountServiceImpl();
        
 //       AccountServiceImpl account1 = ;
        
        account.login();
        
        if (account.getCurrentAccount().getRole().equals(Role.ADMIN)) {
            while(true) {
                System.out.println("====HE THONG QUAN LY TAI KHOAN====");
                System.out.println("XIN CHAO ADMIN" + account.getCurrentAccount().getUserName());
                System.out.println("Chon mot trong cac chuc nang sau: ");
                System.out.println("1. Xem danh sach tai khoan");
                System.out.println("2. Tao tai khoan moi");
                System.out.println("3. Tim kiem tai khoan theo userName");
                System.out.println("4. Xoa tai khoan");
                System.out.println("5. Thay doi trang thai tai khoan(ACTIVE <-> BAN)");
                System.out.println("6. Xem thong tin ca nhan");
                System.out.println("0. Dang xuat");
                System.out.println("--------------------------------");
                System.out.print("Nhap lua chon cua ban: ");
                int choice = sc.nextInt();
                sc.nextLine();
                
                switch (choice) {
                    case 1: 
                        accountList.getAllAccount();
                        break;
                    case 2:                        
//                      accountList.createNewAccount();
                        break;
                    case 3:
                        System.out.print("Nhap userName can tim kiem:");
                        String userName1 = sc.nextLine();
                        
                        ArrayList<Account> foundAccount = accountList.getAccountByUsername(userName1);
                        System.out.println("Found Account: " + foundAccount);
                        break;
                    case 4: 
                        System.out.print("Nhap userName can xoa:");
                        String userName2 = sc.nextLine();
                        
                        accountList.deleteAccount(userName2);
//                        System.out.println("Delete successfully!");
                    case 5:
                        System.out.print("Nhap userName sua: ");
                        String userName3 = sc.nextLine();
                        
                        Status newStatus = Status.ACTIVE;
                        
                        accountList.changeStatus(userName3, newStatus);
                    case 6: 
                        
                        break;
                    case 0:
                        System.exit(0);
                        break;
                }
            }  
        }
        else {
            while(true) {
                System.out.println("====HE THONG NGUOI DUNG====");
                System.out.println("XIN CHAO USER" + account.getCurrentAccount().getUserName());
                System.out.println("Chon mot trong cac chuc nang sau: ");
                System.out.println("1. Doi mat khau");
                System.out.println("2. Xem thong tin ca nhan");
                System.out.println("3. Dang xuat");
                System.out.println("--------------------------------");
                System.out.print("Nhap lua chon cua ban: ");
                
                int choice1 = sc.nextInt();
                sc.nextLine();
            }
        }
    }
}
