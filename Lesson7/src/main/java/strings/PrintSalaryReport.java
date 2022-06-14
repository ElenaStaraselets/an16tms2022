package strings;

import java.util.ArrayList;

public class PrintSalaryReport {
    public static void main(String[] args) {

       ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add (new Employee("Иван Иванович Иванов", 5600.8558));
        employeeArrayList.add(new Employee("Константин Дмитриевич Павлов", 8200));

        for (Employee employee:employeeArrayList) {
            employee.generateReport();
        }



    }
}
