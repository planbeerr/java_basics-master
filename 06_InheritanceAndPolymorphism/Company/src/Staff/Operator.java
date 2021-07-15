package Staff;

public class Operator
        implements Employee{

    private final int OPERATORSALARY = setGuarantedSalary();

    protected int setGuarantedSalary() {
        int min = 25000;
        int max = 45000;
        max -= min;
        return (int) (Math.random() * ++max + min);
    }
    @Override
    public int getMonthSalary() {
        return OPERATORSALARY;
    }
}
