package pl.sdacademy.designpatterns.Singleton.Enum1;

public class FBRegistrationService implements RegistrationService {

    UserRepositoryEnum userRepositoryAppFB = UserRepositoryEnum.INSTANCE;
    @Override
    public void register(final String username, final String email) {
        userRepositoryAppFB.addUser(username,email);

    }




}
