package Staff;

public class Manager implements Employee, IncomeReceivable{

    public int revenue = setManagerRevenue();
    final double salaryBonus = 0.05;
    private final int MANAGERSALARY = (int) (55000 + revenue * salaryBonus);

    protected int setManagerRevenue() {
        int min = 100000;
        int max = 150000;
        max -= min;
        return (int) (Math.random() * ++max + min);
    }

    @Override
    public int getMonthSalary() {
        return MANAGERSALARY;
    }

    @Override
    public int getIncome() {
        return revenue;
    }
}
