package structural.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 14/05/2017.
 */
public class Developer implements Employee {

    private String name;
    private int salary;
    private List<Employee> workers;

    public Developer(int salary, String name) {
        this.name = name;
        this.salary = salary;
        this.workers = new ArrayList<Employee>();
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void addWorker(Employee employee) {}

    public void removeWorker(int index) {}

    public List<Employee> getWorkers() {
        return workers;
    }

    public String report() {
        String output = "My name is " + name + " and my Salary is " + salary;

        return output;
    }
}
