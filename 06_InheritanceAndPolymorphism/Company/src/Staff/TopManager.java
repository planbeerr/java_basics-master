package Staff;

public class TopManager implements Employee{

    private Company company;

    final double SALARY_BONUS = 1.5;
    final int BONUS_THRESOLD = 10000000;
    final int GUARANTEED_SALARY = setGuarantedSalary();

    public TopManager(Company company) {
        this.company = company;
    }

    protected int setGuarantedSalary() {
        int max = 150000;
        int min = 100000;
        max -= min;
        return (int) (Math.random() * ++max + min);
    }

    @Override
    public int getMonthSalary() {
        return company.getIncome() > BONUS_THRESOLD ? (int) (GUARANTEED_SALARY + GUARANTEED_SALARY * SALARY_BONUS) : GUARANTEED_SALARY;
    }
}
