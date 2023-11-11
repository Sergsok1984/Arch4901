package SRP;

public class MySalary {
    private final int baseSalary;

    public MySalary(Employee employee, int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25); //calculate in otherway
        return baseSalary - tax;
    }
}
