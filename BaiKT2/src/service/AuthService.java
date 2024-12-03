
package service;

//import java.util.Scanner;

public interface AuthService {
    public void login();
    public void logout();
    public void changePassword(String username, String oldPassword, String newPassword);
}
