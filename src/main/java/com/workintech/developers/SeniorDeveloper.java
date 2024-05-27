package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        this.setSalary(this.getSalary() + 3000); // Example increment logic
        System.out.println("SeniorDeveloper is working on advanced tasks");
    }
}
