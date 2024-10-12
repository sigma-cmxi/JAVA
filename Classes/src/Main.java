public class Main {

    public static void main(String[] args) {
    var employee = new Employee();
    employee.setBaseSalary(1000);
    employee.setHourlySalary(3);

    int wage = employee.calcwage(20);
        System.out.println(wage);

        var browser = new Browser();
        browser.navigate("2222");
    }
}
