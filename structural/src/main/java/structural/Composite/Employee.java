package structural.Composite;

import java.util.List;

/**
 * Created by david on 14/05/2017.
 */
public interface Employee {
    int getSalary();
    String getName();
    void addWorker(Employee employee);
    void removeWorker(int index);
    List<Employee> getWorkers();
    String report();
}

