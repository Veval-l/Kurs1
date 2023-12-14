public class EmployeeList {
    private Employee[] employee;

    public EmployeeList() {
        this.employee = new Employee[10];

        employee[0] = new Employee("Иванов Иван Иванович", 1, 10000);
        employee[1] = new Employee("Петров Петр Петрович", 2, 20000);
        employee[2] = new Employee("Игорев Игорь Игоревич", 3, 30000);
        employee[3] = new Employee("Алексеев Алексей Алексеевич", 4, 40000);
        employee[4] = new Employee("Юрьев Юрий Юрьевич", 5, 50000);
        employee[5] = new Employee("Владимиров Владимир Владимирович", 1, 60000);
        employee[6] = new Employee("Станиславов Станислав Станиславович", 2, 70000);
        employee[7] = new Employee("Николаев Николай Николаевич", 3, 80000);
        employee[8] = new Employee("Павлов Павел Павлович", 4, 90000);
        employee[9] = new Employee("Сергеев Сергей Сергеевич", 5, 95000);
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void printAllEmployees() {
        for (Employee all : employee) {
            if (employee == null) {
                continue;
            }
            System.out.println(all);

        }
    }

    public double allSalaryForMonth(Employee[] employee) {
        double sum = 0;
        for (Employee value : this.employee) {
            if (value != null) {
                sum += value.getSalary();
            }
        }
        return sum;
    }

    public void minSalary(Employee[] employee) {
        double minSalary = Integer.MAX_VALUE;
        int target = 0;
        for (int i = 0; i < this.employee.length; i++) {
            if (employee == null) {
                continue;
            }
            if (this.employee[i].getSalary() < minSalary) {
                minSalary = this.employee[i].getSalary();
                target = i;
            }
        }
        System.out.println("Сотрудник с наименьшей зарплатой за месяц - " + this.employee[target].getNameEmployee());
    }

    public void maxSalary(Employee[] employee) {
        double maxSalary = Integer.MIN_VALUE;
        int target = 0;
        for (int i = 0; i < this.employee.length; i++) {
            if (employee == null) {
                continue;
            }
            if (this.employee[i].getSalary() > maxSalary) {
                maxSalary = this.employee[i].getSalary();
                target = i;
            }
        }
        System.out.println("Сотрудник с наибольшей зарплатой за месяц - " + this.employee[target].getNameEmployee());
    }

    public double averageSalaryForMonth(Employee[] employee) {
        return allSalaryForMonth(getEmployee()) / this.employee.length;
    }

    public void nameEmployees(Employee[] employee) {
        System.out.println("Список сотрудников:");
        for (Employee employee : employee) {
            if (employee != null) {
                System.out.println(employee.getNameEmployee());
            }
        }
    }
}


