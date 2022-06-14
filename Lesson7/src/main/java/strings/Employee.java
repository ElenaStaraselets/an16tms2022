package strings;

import java.util.StringTokenizer;

public class Employee implements Report {
    String fullName;
    double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public void generateReport() {
        StringTokenizer st = new StringTokenizer(fullName," ");
        if(st.countTokens() == 3) {
            String fio = st.nextToken().substring(0, 1) + ". " + st.nextToken().substring(0, 1) + ". " + st.nextToken();
            String sSalary = String.format("%.2f",salary);

            System.out.println("|" + String.format("%-20s", fio) + " | " + String.format("%20s", sSalary) + " | ");

        }
        else {
            System.out.println("Введите имя, отчество и фамилию");
        }

    }
}
