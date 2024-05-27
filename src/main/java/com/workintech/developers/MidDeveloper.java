package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        this.setSalary(this.getSalary() + 2000); // Example increment logic
        System.out.println("MidDeveloper is working on intermediate tasks");
    }
}
