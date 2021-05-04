import pattern.buider.User;
import pattern.decorator.IProgrammer;
import pattern.decorator.Junior;
import pattern.decorator.Senior;

public class Main {
    public static void main(String[] args) {

        IProgrammer junior = new Junior();
        System.out.println(junior.salaryAmount());
        System.out.println(junior.yearsOfExperience());
        junior.typing("Text");

        IProgrammer senior = new Senior(junior);
        senior.typing("OMG!");
        System.out.println(senior.salaryAmount());
        System.out.println(senior.yearsOfExperience());

        new User.BuilderUser()
                .withId(123456)
                .withName("asdf")
                .withYears(2001)
                .build();
    }
}
