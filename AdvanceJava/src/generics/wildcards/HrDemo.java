package generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class HrDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Bart"),
                new Employee("Homer"),
                new Employee("Lisa"),
                new Employee("Maggie")
        );

        List<Salaried> salarieds = Arrays.asList(
                new Salaried("Kyle"),
                new Salaried("Stan"),
                new Salaried("Kenny"),
                new Salaried("Cartman")
        );

        System.out.println(employees);
        System.out.println(salarieds);

        System.out.println("Employees:");
        Hr.printEmployeeNames(employees);

        System.out.println();
        System.out.println("Salaried list:");
        Hr.printEmployeeAndSubClassNames(salarieds);

        System.out.println();
        System.out.println("Print all (filtered):");
        Hr.printAllFiltered(
                employees,
                e -> e.toString().length() % 2 == 0);
    }
}
