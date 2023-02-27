package org.school.management.model;

import java.util.List;

/**
 * Many teachers , many students.
 * Implements teachers and students
 * using ArrayList
 * Created by Susan on 24/2/2023.
 */
public class School {
    private List<String> teachers;
    private List<String> students;
    private int totalMoneyEarned;
    private  int totalMoneySpent;

    /**
     *  new school object is created.
     * @param teachers List of teachers in the school.
     * @param students List of students in the school.
     */
    public School(List<String> teachers, List<String> students) {
        this.teachers = teachers;
        this.students = students;
    }


    /**
     *
     * @return the list of Teachers in the school.
     */
    public List<String> getTeachers() {
        return teachers;
    }

    /**
     * Add a teacher to the school.
     * @param teachers the teacher to be added.
     */
    public void addTeachers(Teacher teachers) {
        teachers.add(teachers);


    }

    /**
     *
     * @return the List of students in the school.
     */
    public List<String> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school.
     * @param students the student to be added to the school.
     */
    public void addStudents(Students students) {
        students.add(students);
    }

    /**
     *
     * @return the total money earned by the school.
     * l
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param MoneyEarned money that is supposed to be added.
     */
    public  void updateTotalMoneyEarned(int MoneyEarned) {
        this.totalMoneyEarned+= MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school.
     */
    public  int updateTotalMoneySpent(int totalMoneySpent) {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which
     * is the salary given by the school to its teachers.
     * @param moneySpent the money spent by the school.
     */
    public void setTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

}
