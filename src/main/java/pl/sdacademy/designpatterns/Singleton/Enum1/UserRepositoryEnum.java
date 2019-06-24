package pl.sdacademy.designpatterns.Singleton.Enum1;

import java.util.HashMap;
import java.util.Map;

public enum UserRepositoryEnum {
    INSTANCE;

    public Map<String, String> usernamesToEmails = new HashMap<>();

    private UserRepositoryEnum() {
    }

    public Map<String, String> getUsernamesToEmails() {
        return usernamesToEmails;
    };
    public void addUser(String username, String email){
        usernamesToEmails.put(username,email);
    }
}
