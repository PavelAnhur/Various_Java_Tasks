package pattern.factory;

public class PersonFactory {

    public static Person getStandardPerson() {
        return new Person("Peter", "Voo");
    }
}
