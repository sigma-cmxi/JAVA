public class Main {

    public static void main(String[] args) {
    var employee = new Employee();
    employee.baseSalary = 10000;
    employee.hourlySalary= 30;

    int wage = employee.calcwage(20);
    System.out.println(wage);
    }
}
