package pl.sdacademy.designpatterns.Singleton.Enum1;

public class GoogleRegistrationService implements RegistrationService {

    UserRepository userRepositoryGoo;

    @Override
    public void register(final String username, final String email) {
        userRepositoryGoo.addUser(username, email);
    }

}
