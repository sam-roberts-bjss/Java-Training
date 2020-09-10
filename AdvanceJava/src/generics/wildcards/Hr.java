package generics.wildcards;

import java.util.List;
import java.util.function.Predicate;

public class Hr {
    public static void printEmployeeNames(List<Employee> employees) {
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    public static void printEmployeeAndSubClassNames(List<? extends Employee> employees) {
        employees
                .stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    public static void printAllFiltered(
            List<? extends Employee> employees,
            Predicate<? super Employee> predicate
    ) {
        for (Employee e : employees) {
            if (predicate.test(e)) {
                System.out.println(e.getName());
            }
        }
    }
}
