
package service;

import java.util.ArrayList;
import model.Account;
import model.Status;

public class AccountServiceImpl implements AccountService{
    public ArrayList<Account> accountList = new ArrayList<>();
    
    @Override
    public ArrayList<Account> getAllAccount() {
        return accountList;
    }
    
    @Override
    public void createNewAccount(Account account) {
        if (accountList.add(account))
            System.out.println("Create successfully!");
        else
            System.out.println("Create unsuccessfully!");
    }
    
    @Override
    public ArrayList<Account> getAccountByUsername(String userName) {
        ArrayList<Account> result = new ArrayList<>();
        
        for (Account account : accountList) {
            if (account.getUserName().contains(userName)) {
                result.add(account);
            }
        }
        return result;
    }
    
    @Override
    public void deleteAccount(String userName) {
        for (Account account : accountList) {
            if (account.getUserName().contains(userName)) {
                accountList.remove(account);
            }
        }
    }
    
    @Override
    public void changeStatus(String userName, Status status) {
        for (Account account : accountList) {
            if (account.getUserName().contains(userName)) {
                account.setStatus(status);
            }
        }
    } 
}
