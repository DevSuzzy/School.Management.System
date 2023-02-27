package org.school.management.model;

/**
 * Created by Susan on the 24/02/2023
 * this classis responsible for keeping the track
 * name, id, and salary.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    /**
     * Creates a Teacher object.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param  salary of the teacher.
     */
    public Teacher (int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return the id.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the teacher.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the salary of the teacher.
     */
    public int getSalary() {
        return salary;
    }

    /**
     *
     * @param salary sets the salary of the teacher.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void add(Teacher teachers) {
        teachers.add(teachers);


    }

    /** Adds to salary Earned
     * removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary, School school) {
        salaryEarned+=salary ;
        school.updateTotalMoneySpent(salary);
    }

}

