import Staff.*;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Company company = new Company();

        ArrayList<Employee> operators = new ArrayList<>();
        int count = 180;
        for (int i = 0; i < count; i++) {
            operators.add(new Operator());
        }

        company.hireAll(operators);

        ArrayList<Employee> managers = new ArrayList<>();
        int count1 = 80;
        for (int i = 0; i < count1; i++) {
            managers.add(new Manager());
        }
        company.hireAll(managers);

        ArrayList<Employee> topManagers = new ArrayList<>();
        int count2 = 10;
        for (int i = 0; i < count2; i++) {
            topManagers.add(new TopManager(company));
        }
        company.hireAll(topManagers);

        System.out.println("Общий доход компании: " + company.getIncome() + " рублей.");

        System.out.println("Список самых высокооплачиваемых сотрудников:");
//        ArrayList<Employee> list = new ArrayList<>(company.getTopSalaryStaff(15));

        printArr(company.getTopSalaryStaff(300));

        System.out.println("Список самых низкооплачиваемых сотрудников:");
        printArr(company.getLowerSalaryStaff(30));

        System.out.println("Количество сотрудников в компании: " + company.getCountEmployees() + " человек.");

        System.out.println("Увольняем половину сотрудников!");
        company.fire(company.getCountEmployees()/2);

        System.out.println("Количество сотрудников в компании: " + company.getCountEmployees() + " человек.");

        System.out.println("Общий доход компании: " + company.getIncome() + " рублей.");

        System.out.println("Список самых высокооплачиваемых сотрудников:");
        printArr(company.getTopSalaryStaff(15));

        System.out.println("Увольняем сотрудника с самой большой зарплатой" + company.fireOneBigSalary().getMonthSalary());


        System.out.println("Список самых высокооплачиваемых сотрудников:");
        printArr(company.getTopSalaryStaff(15));
    }

    private static void printArr(List<Employee> employee) {
        for (int i = 0; i < employee.size(); i++) {
            System.out.println(i + 1 + ". " + employee.get(i).getMonthSalary());
        }
    }

}
