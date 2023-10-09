
/**
 * Рабочий (фулл-тайм)
 */
public class Worker extends Employee {

    public int age;    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Worker(String surName, String name, double salary, int age) {
        super(surName, name, salary);
        this.age = age;
    }
    

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; %d лет; Среднемесячная заработная плата (фиксированная): %.2f (руб.)",
                surName, name, age, calculateSalary());
    }
}
