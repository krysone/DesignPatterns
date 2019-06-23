package pl.sdacademy.designpatterns.Singleton.Enum1;

public class Main {
    public static void main(String[] args) {
        FBRegistrationService fbRegistrationService = new FBRegistrationService();
        GoogleRegistrationService googleRegistrationService = new GoogleRegistrationService();

        fbRegistrationService.register("Jack", "wedwe@gmail.com");
        fbRegistrationService.register("Jane", "dscsw@gmail.com");
        fbRegistrationService.register("Val", "wefwlkmlc@gmail.com");
        fbRegistrationService.register("David", "sdcw@gmail.com");
        fbRegistrationService.register("Kay", "wcdsferedwe@gmail.com");
        googleRegistrationService.register("Joe", "wcdcsknodsferedwe@gmail.com");
        googleRegistrationService.register("Rachel", "wcdscukmksferedwe@gmail.com");

//        System.out.println(userRep);
     }
}
