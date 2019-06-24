package pl.sdacademy.designpatterns.Singleton.Enum1;

public class GoogleRegistrationService implements RegistrationService {

    UserRepositoryEnum userRepositoryAppGoo = UserRepositoryEnum.INSTANCE;

    @Override
    public void register(final String username, final String email) {
        userRepositoryAppGoo.addUser(username, email);
    }

}
