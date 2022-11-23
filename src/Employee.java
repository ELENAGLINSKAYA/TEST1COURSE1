import java.util.Objects;

public class Employee {
    private int id;
    private int departments;
    private String fullName;
    private double salary;
    private static int counter = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartments() {
        return departments;
    }

    public void setDepartments(int departments) {
        this.departments = departments;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }

    public Employee(String fullName, int departments, double salary) {
        this.departments = departments;
        this.salary = salary;
        this.fullName = fullName;
        id = ++counter;
        Employee[] employees = new Employee[10];
    }
    public static void printArray (Employee[]employees){
        for (Employee employee : employees)
            System.out.println(employee.toString());
    }
    public static double calculateSalary() {
        double sum = 0;
        for (double i = 0; i < Main.employees.length; i++) ;
        return sum;
    }
    public static Employee findMaxSalary(Employee[]employees){
        if (employees.length > 0) {
            Employee result = employees[0];
            for (var employee : employees)
                if (result.salary < employee.salary)
                    result = employee;
            return result;
        } else
            return new Employee("-", -1, 0);
    }
    public static Employee findMinSalary(Employee[]employees) {
        if (employees.length > 0) {
            Employee result = employees[0];
            for (var employee : employees)
                if (result.salary > employee.salary)
                    result = employee;
            return result;
        }
        else
            return new Employee("-", -1, 0);
    }
    public static  double getAverageSalary(Employee[] employees) {
        double getAverageSalary = calculateSalary()/ employees.length;

        return getAverageSalary;
    }
    @Override
    public String toString() {
        return String.format("%d.%s; номер отдела : %d;зарплата :%2f", id, fullName, departments, salary);

    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, id, salary, departments);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(fullName, employee.fullName) && Objects.equals(departments, employee.departments);
    }
}
