public class Employee {
    public int baseSalary;
    public int hourlySalary;
    public int calcwage(int extraHours) {
        return baseSalary + (extraHours * hourlySalary);
    }
}
