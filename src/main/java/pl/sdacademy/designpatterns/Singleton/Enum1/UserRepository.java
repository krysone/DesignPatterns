package pl.sdacademy.designpatterns.Singleton.Enum1;

import java.util.Map;

public  class UserRepository {
    public UserRepositoryEnum userRepository = UserRepositoryEnum.INSTANCE;

    public Map<String, String> usernamesToEmails;

    private UserRepository() {
    }

    public Map<String, String> getUsernamesToEmails() {
        return usernamesToEmails;
    };
    public void addUser(String username, String email){
        usernamesToEmails.put(username,email);
    };
}
