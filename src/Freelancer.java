
/**
 * TODO: Реализовать тип фрилансера в рамках домашней работы
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee {

    public int hourlyRate;
    public int age;

    public Freelancer(String surName, String name, double salary, int hourlyRate, int age) {
        super(surName, name, salary);
        this.hourlyRate = hourlyRate;
        this.age = age;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public double calculateSalary() {
        return 20.8 * 8 * hourlyRate;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; %d лет; Среднемесячная заработная плата (не фиксированная): %.2f (руб.)",
                surName, name, age, calculateSalary());
    }
}