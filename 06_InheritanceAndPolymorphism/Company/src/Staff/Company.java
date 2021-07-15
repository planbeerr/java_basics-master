package Staff;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Company{
    public int income;

    ArrayList<Employee> employees = new ArrayList<>();

    public List<Employee> getListEmployees() {
        return new ArrayList<>(employees);
    }

    private List<Employee> sortList(Comparator<Employee> comparator, int count) {
        employees.sort(comparator);
        int checkCount = Math.min(count, employees.size());
        return employees.subList(0, checkCount);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return sortList(new SalaryComparator(), count);
    }

    public List<Employee> getLowerSalaryStaff(int count) {
        return sortList(new SalaryComparator().reversed(), count);
    }

    public int getIncome() {
        int income = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof IncomeReceivable) {
                income += ((IncomeReceivable) employees.get(i)).getIncome();
            }
        }
        return income;
    }

    public void printEmployees() {
        for (int i = 0; i <= employees.size() - 1; i++) {
            System.out.println(i + " " + employees.get(i));
        }
    }

    public void hireAll(ArrayList<Employee> employee) {
        employees.addAll(employee);
    }

    public void hire(Object employee) {
        employees.add((Employee) employee);
    }

    public int getCountEmployees() {
        return employees.size();
    }

    public void fire(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int fire = random.nextInt(employees.size());
            employees.remove(fire);
        }
    }
    public Employee fireOneBigSalary() {
        Employee employee = getTopSalaryStaff(1).get(0);
        employees.remove(employee);
        return employee;
    }
}
