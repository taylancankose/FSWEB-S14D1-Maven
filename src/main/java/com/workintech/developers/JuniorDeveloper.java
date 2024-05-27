package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        this.setSalary(this.getSalary() + 1000); // Example increment logic
        System.out.println("JuniorDeveloper is working on basic tasks");
    }
}
