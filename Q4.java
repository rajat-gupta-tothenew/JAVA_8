import java.util.*;
import java.util.stream.*;

class Employee {
    private String fullName;
    private long salary;
    private String city;

    Employee(String fullName, long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
    public String getFullName() {
        return fullName;
    }
    public String getFirstName() {
        String[] arr = fullName.split(" ", 2);
        String res = arr[0];
        return res;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}

public class Q4 {
    public static void main(String[] args) {
        //System.out.println(Arrays.asList(1,2,3,4,5,6).stream().filter(e -> e%2==0));

        System.out.println(Arrays.asList(1,2,3,4,5,6).stream().filter(e -> e%2==0).collect(Collectors.toList()));
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Rajat mn ln", 45000, "Etawah"));
        employeeList.add(new Employee("Ashish mn ln", 40000, "Noida"));
        employeeList.add(new Employee("Bhupendra mn ln", 35000, "Dadri"));
        employeeList.add(new Employee("Bhupendra mn ln", 30000, "Bihar"));
        employeeList.add(new Employee("Lokesh mn ln", 2500, "Delhi"));
        employeeList.add(new Employee("Sneha mn ln", 2000, "Delhi"));


        List<String> result = employeeList.stream().filter(a -> a.getCity().equals("Delhi")).filter(q -> q.getSalary()<5000).map(h -> h.getFirstName()).collect(Collectors.toList());

        String collectDistinct = result.stream().collect(Collectors.joining(" "));
        System.out.println(collectDistinct);
    }
}
