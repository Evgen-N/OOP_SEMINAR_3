
import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    private SortType sortType;

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }

    public AgeComparator(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {

        int age1, age2;
        if (o1 instanceof Worker) {
            age1 = ((Worker) o1).getAge();
        }
        else { 
            age1 = ((Freelancer) o1).getAge();
        }
        if (o2 instanceof Worker) {
            age2 = ((Worker) o2).getAge();
        }
        else {
            age2 = ((Freelancer) o2).getAge();
        }
        

        if (sortType == SortType.Ascending){
            return Integer.compare(age1, age2);
        }
        else {
            return Integer.compare(age2, age1);
        }

    }
}
