import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        EmployeeList employeeList = new EmployeeList();

        employeeList.printAllEmployees();
        System.out.println("Месячная выплата всем сотрудникам = " + employeeList.allSalaryForMonth(employeeList.getEmployee()));
        employeeList.minSalary(employeeList.getEmployee());
        employeeList.maxSalary(employeeList.getEmployee());
        System.out.println("Среднее зарплат всех сотрудников = " + employeeList.averageSalaryForMonth(employeeList.getEmployee()));
        employeeList.nameEmployees(employeeList.getEmployee());


    }
}