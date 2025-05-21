package com.pluralsight.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Person> millionaireList = Arrays.asList(
                new Person("Elon", "Musk", 52),
                new Person("Jeff", "Bezos", 60),
                new Person("Mark", "Zuckerberg", 40),
                new Person("Bill", "Gates", 68),
                new Person("Warren", "Buffett", 93),
                new Person("Bernard", "Arnault", 75),
                new Person("Larry", "Page", 51),
                new Person("Sergey", "Brin", 50),
                new Person("Steve", "Ballmer", 68),
                new Person("Mukesh", "Ambani", 67)
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search (first or last): ");
        String nameToSearch = scanner.nextLine().toLowerCase();

        // Step 1 - Stream + filter
        List<Person> matches = millionaireList.stream()
                .filter(p -> p.getFirstName().toLowerCase().contains(nameToSearch)
                        || p.getLastName().toLowerCase().contains(nameToSearch))
                .collect(Collectors.toList());

        System.out.println("\nMatched people:");
        matches.forEach(p -> System.out.println(p.getFullName()));

        // Step 2 - Average age
        double averageAge = millionaireList.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
        System.out.printf("\nAverage age: %.2f\n", averageAge);

        // Step 3 - Oldest and youngest
        int oldest = millionaireList.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(0);

        int youngest = millionaireList.stream()
                .mapToInt(Person::getAge)
                .min()
                .orElse(0);

        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);
    }
}