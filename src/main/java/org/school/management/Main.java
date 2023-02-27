package org.school.management;

import org.school.management.model.School;
import org.school.management.model.Students;
import org.school.management.model.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Susan on 24/2/2023.
 */
public class Main {
    public static void main(String[] args) {
        Teacher Lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2,"Mellisa", 700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);

        List<String> teacherList = new ArrayList<>();
        teacherList.add("lizzy");
        teacherList.add("mellisa");
        teacherList.add("vanderhorn");

        Students tamasha = new Students(1,"Tamasha",4);
        Students rakshith = new Students(2,"Rakshith Vasudev",12);
        Students rabbi = new Students(3,"Rabbi",5);

        List<String> studentsList = new ArrayList<>();
        studentsList.add("tamasha");
        studentsList.add("rakshith vasudev");
        studentsList.add("rabbi");

        School ghs = new School(teacherList,studentsList);

        tamasha.payFees(5000,ghs);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());
        rakshith.payFees(6000,ghs);
        System.out.println("GHS has  earned $" + ghs.getTotalMoneyEarned());


        System.out.println("-----------Making SCHOOL PAY SALARY----");
        Lizzy.receiveSalary(Lizzy.getSalary(),ghs);
        System.out.println("GHS has spent for salary to " + Lizzy.getName() +" and now has $" + ghs.getTotalMoneyEarned());





    }
}
