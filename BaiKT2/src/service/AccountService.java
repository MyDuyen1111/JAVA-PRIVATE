
package service;

import java.util.ArrayList;
import model.Account;
import model.Status;

public interface AccountService {
    public ArrayList<Account> accountList = new ArrayList<>();
    
    public ArrayList<Account> getAllAccount();
    public void createNewAccount(Account account);
    public ArrayList<Account> getAccountByUsername(String userName);
    public void deleteAccount(String userName);
    public void changeStatus(String userName, Status status);
}
