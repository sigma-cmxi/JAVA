public class Employee {
    private int baseSalary;
    private int hourlySalary;

    public int calcwage(int extraHours) {
        return baseSalary + (extraHours * hourlySalary);
    }

    public int setBaseSalary (int baseSalary) {
        if (baseSalary <= 0 )
            throw new IllegalArgumentException("Error baseSalary");
        this.baseSalary = baseSalary;
        return baseSalary;
    }
    public int setHourlySalary (int hourlySalary) {
        if (hourlySalary <= 0 )
            throw new IllegalArgumentException("Error hourlySalary");
        this.hourlySalary = hourlySalary;
        return hourlySalary;
    }

}
