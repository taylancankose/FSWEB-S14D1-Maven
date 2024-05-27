package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[10];
    private MidDeveloper[] midDevelopers = new MidDeveloper[10];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[10];

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        this.setSalary(40000);
        System.out.println("HRManager starts to working");
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDeveloper;
                System.out.println("JuniorDeveloper added to the team");
                return;
            }
        }
        System.out.println("No space to add more JuniorDevelopers");
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDeveloper;
                System.out.println("MidDeveloper added to the team");
                return;
            }
        }
        System.out.println("No space to add more MidDevelopers");
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDeveloper;
                System.out.println("SeniorDeveloper added to the team");
                return;
            }
        }
        System.out.println("No space to add more SeniorDevelopers");
    }
}
