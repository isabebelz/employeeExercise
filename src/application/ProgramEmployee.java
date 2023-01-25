package application;

import entities.Employee;

import java.util.*;

public class ProgramEmployee {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int quantityEmployees = sc.nextInt();


        List<Employee> employees = new ArrayList<>();

        Employee[] person = new Employee[quantityEmployees];


        for (int i = 0; i < quantityEmployees; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            person[i] = new Employee(id, name, salary);
            employees.add(person[i]);
        }

        for (int i = 0; i < quantityEmployees; i++) {
            for(int j = 0; j < quantityEmployees; j++) {
                if(person[i].getId().equals(person[j].getId()) && i != j) {
                    System.out.println("ERROR: Existent Id");
                    System.out.println("Please, change the id of the " + person[i].getName() + ": ");
                    person[j].setId(sc.nextInt());
                }
            }
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idForIncrease = sc.nextInt();

        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        if(employees.contains(idForIncrease)) {
            for(int i = 0; i < quantityEmployees; i++) {
                if(person[i].getId() == idForIncrease) {
                    person[i].setSalary(percentage);
                }
            }
        }

        System.out.println();

        for(Employee persons : employees) {
            System.out.println(persons);
        }

        sc.close();
    }
}
