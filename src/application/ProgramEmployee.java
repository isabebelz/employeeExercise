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
        }

        for (int i = 0; i < quantityEmployees; i++) {
            for(int j = 0; j < quantityEmployees; j++) {
                if(person[i].getId().equals(person[j].getId()) && i != j) {
                    System.out.println("ERROR: Existent Id");
                    System.out.println("Please, change the id of the " + person[i].getName() + ": ");
                    person[i].setId(sc.nextInt());
                }
            }
        }

        sc.close();
    }
}
