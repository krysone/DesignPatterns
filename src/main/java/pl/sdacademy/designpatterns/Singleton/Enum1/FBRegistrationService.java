package pl.sdacademy.designpatterns.Singleton.Enum1;

public class FBRegistrationService implements RegistrationService {

    UserRepository userRepositoryFB;
    @Override
    public void register(final String username, final String email) {
        userRepositoryFB.addUser(username,email);

    }




}
