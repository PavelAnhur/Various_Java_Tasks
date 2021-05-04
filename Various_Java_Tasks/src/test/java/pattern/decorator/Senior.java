package pattern.decorator;

public class Senior implements IProgrammer{

    private final IProgrammer decorated;

    public Senior(IProgrammer decorated) {
        this.decorated = decorated;
    }

    @Override
    public void typing(String text) {
        System.out.println("Senior typing " + text);
    }

    @Override
    public int yearsOfExperience() {
        return decorated.yearsOfExperience() + 3;
    }

    @Override
    public int salaryAmount() {
        return decorated.salaryAmount() + 1500;
    }
}
