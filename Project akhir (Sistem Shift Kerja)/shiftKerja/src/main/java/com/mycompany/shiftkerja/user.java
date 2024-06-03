/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ANDHIKA ANANTA PUTRA
 */
public class user {
    private final List<String> usernames;
    private final List<String> passwords;
    
    public user() {
        this.usernames = new ArrayList<>();
        this.passwords = new ArrayList<>();
    }

    public void addUser(String username, String password) {
        usernames.add(username);
        passwords.add(password);
    }

    public boolean isValidUser(String username, String password) {
        for (int i = 0; i < usernames.size(); i++) {
            if (usernames.get(i).equals(username) && passwords.get(i).equals(password)) {
                return true;
            }
        }
        return false;
    }

    public String getUsername(int index) {
        return usernames.get(index);
    }

    public String getPassword(int index) {
        return passwords.get(index);
    }
}
