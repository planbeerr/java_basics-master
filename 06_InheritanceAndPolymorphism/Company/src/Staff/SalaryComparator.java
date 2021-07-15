package Staff;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee employee1) {

        if (employee.getMonthSalary() > employee1.getMonthSalary()) {
            return -1;
        }
        else if (employee.getMonthSalary() < employee1.getMonthSalary()) {
            return 1;
        }
        else return 0;
    }
}
