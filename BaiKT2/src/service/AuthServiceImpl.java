
package service;

import service.AuthService;
import model.Account;
import model.Role;
import model.Status;
import java.util.ArrayList;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService{
    
    Scanner sc = new Scanner(System.in);
    private ArrayList<Account> accountList = new ArrayList<Account>();
    private Account currentAccount;
    
//    public AuthServiceImpl(){
//        accountList.add(new Account("Admin", "Duyen", 19, "Quoc Oai", "Ha Noi", "11/11", "Admin", "123456", Role.ADMIN, Status.ACTIVE));
//        currentAccount = null;
//    }

    public Account getCurrentAccount() {
        return currentAccount;
    }
    
    @Override
    public void login() {
        System.out.print("Enter userName: ");
        String userName = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        
        for (Account account: accountList) {
            if(account.getUserName().equals(userName) && account.getPassword().equals(password)){
                currentAccount = account;
                System.out.println("Login successfully!");
                return;
            }
        }
        System.out.println("Invalid userName or password!");
    }   
    
    @Override
    public void logout() {
        if(currentAccount != null) {
            System.out.println("Logout successfully!");
            currentAccount = null;
        } 
        else
            System.out.println("No user is currently logged in!");
    }
    
    @Override
    public void changePassword(String userName, String oldPassword, String newPassword) {
        for (Account account: accountList) {
            if (account.getUserName().contains(userName)) {
                if (account.getPassword().contains(oldPassword)){
                    account.setPassword(newPassword);
                }
            }
        }
    }
}
