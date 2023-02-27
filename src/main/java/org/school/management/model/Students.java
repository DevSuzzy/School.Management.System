package org.school.management.model;
/**
*Created by Susan on the 23/02/2023
* This class is responsible for keeping the
* tracks of students fees, names,grades and fees paid
 */
public class Students {
    private int Id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * To create a student by initializing
     * @param id id for the student:unique.
     * @param name name for the student.
     * @param grade grade of the student.n
     * @param
     * @param
     */
    public Students(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        Id = id;
        this.name = name;
        this.grade = grade;
    }

    // not going to alter students name, student's id.

    /**
     * used to update the student grade.
     * @param grade new grade of the student.
     *
     */


    public void setGrade (int grade) {
        this.grade = grade;

    }

    /**
     keeping adding the fees to feesPaid Fields.
    Add the fees to the fees paid.
     * the school is going to receive the funds.
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees, School school) {
        feesPaid+= fees;
        System.out.println(feesPaid);
        school.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id the student.
     *
     */
    public int getId() {
        return Id;
    }

    /**
     *
     * @return the name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the Fees Total of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    public void add(Students students) {

    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

}
