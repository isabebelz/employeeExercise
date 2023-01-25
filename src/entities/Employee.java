package entities;

import java.util.List;

public class Employee {
    private String name;
    private static Double salary;
    private Integer id;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double percentage) {
        this.salary = (salary * percentage) + salary;
    }

    public static double isIdIncrease(double percentage, Double salary) {
        return (salary * percentage) + salary;
    }

    public String toString() {
        return id + ", "
                + name + ", "
                + salary;
    }
}
