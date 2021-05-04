package pattern.decorator;

public class Junior implements IProgrammer {

    @Override
    public void typing(String text) {
        System.out.println("Junior typing " + text);
    }

    @Override
    public int yearsOfExperience() {
        return 1;
    }

    @Override
    public int salaryAmount() {
        return 500;
    }
}
