/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> listOfUserAccounts;

    public UserAccountDirectory() {
        listOfUserAccounts = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return listOfUserAccounts;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : listOfUserAccounts)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        listOfUserAccounts.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : listOfUserAccounts){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public void removeUserAccount(UserAccount userAccount){
        
        listOfUserAccounts.remove(userAccount);
        
    }
    
    public UserAccount searchUser(String username){
        for(UserAccount ua : listOfUserAccounts){
            if(ua.getUsername().equals(username)){
                return ua;
            }
        }
        return null;
    }
    
    public void modifyUserAccount(UserAccount userAccount,String username,String password){
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        //userAccount.setRole(role);
        
    }
}
