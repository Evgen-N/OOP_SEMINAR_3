
import java.util.Arrays;
import java.util.Random;

public class Task2 {

    private static Random random = new Random();

    /*
     * Границы диапазонов для генерации случайных параметров работников. 
     */    
    static int maxSalaryWorker = 120000;
    static int minSalaryWorker = 80000;
    static int maxHourlyRateFree = 1000;
    static int minHourlyRateFree = 500;
    static int maxAge = 50;
    static int minAge = 20;
    static String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
    static String[] surNames = new String[] { "Григорьев", "Фокин", "Быков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

    static Worker generateWorker(){
        int age = random.nextInt(maxAge - minAge) + minAge;
        double salary = random.nextInt(maxSalaryWorker - minSalaryWorker) + minSalaryWorker;
        Worker worker = new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary, age);
        return worker;
    }

    static Freelancer generateFreelancer(){
        int age = random.nextInt(maxAge - minAge) + minAge;
        int hourlyRate = random.nextInt(maxHourlyRateFree - minHourlyRateFree) + minHourlyRateFree;
        double salary = 20.8 * 8 * hourlyRate;
        Freelancer freelancer = new Freelancer(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary, hourlyRate, age);
        return freelancer;
    }

    /**
     * TODO: Метод generateEmployees должен быть универсальным, возвращать некоторое кол-во
     *  сотрудников различных типов
     * @param count
     * @return
     */
    static Employee[] generateEmployees(int count){
        Employee[] array = new Employee[count];
        for (int i = 0; i < array.length; i++){
            if(random.nextInt(2) == 0){
                array[i] = generateWorker();
            }
            else{
                array[i] = generateFreelancer();
            }
        }
        return array;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees(10);

        Arrays.sort(employees, new AgeComparator(SortType.Ascending));

        System.out.println("Сортировка по возрасту");

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        // System.out.println();

        // Arrays.sort(employees, new SalaryComparator(SortType.Descending));

        // for (Employee employee: employees) {
        //     System.out.println(employee);
        // }

    }












}
