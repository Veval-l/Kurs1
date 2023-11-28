import java.util.Objects;
public class Employee {
    private String nameEmployee;
    private int numberOfDepartment;
    private int salary;
    static int counter = 1;
    private int id;


    public Employee(String nameEmployee, int numberOfDepartment, int salary) {
        this.nameEmployee = nameEmployee;
        this.numberOfDepartment = numberOfDepartment;
        this.salary = salary;
        id = counter;
        counter++;
    }

    public String getNameEmployee(){return this.nameEmployee;}
    public int getNumberOfDepartment(){return this.numberOfDepartment;}
    public int getSalary(){return this.salary;}
    public void setNumberOfDepartment(int numberOfDepartment){this.numberOfDepartment = numberOfDepartment;}
    public void setSalary(int salary){this.salary = salary;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return numberOfDepartment == employee.numberOfDepartment && salary == employee.salary && id == employee.id && Objects.equals(nameEmployee, employee.nameEmployee);
    }
    @Override
    public String toString() {
        return "Employee{" +
                " nameEmployee = " + nameEmployee +
                ", numberOfDepartment = " + numberOfDepartment + ", salary = " +
                salary + ' ' +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameEmployee, numberOfDepartment, salary, id);
    }
}

