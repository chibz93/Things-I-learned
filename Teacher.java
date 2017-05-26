package com.company;

import java.util.Arrays;

/**
 * Created by Chibuzo Nwobiri on 04/04/2017. Here in the class I'm trying to chain constructors
 */
public class Teacher extends School {
    //Some arrays that were used for gathering data and making "timetables"
    String[] teacher = new String[] {"Mason","Jackson","Myers","Smith","York","Daniels"};
    String[] Subject = new String[]{"English", "Maths", "Science", "History", "IT", "French", "Spanish"};
    String[] classNo = new String[]{"Class1","Class2","Class3","Class4","Class5","Class6"};
    private int period;

    public Teacher(){
        this.classNo = classNo;
        this.teacher = teacher;
        this.Subject = Subject;
    }

    public Teacher(String teacher, int classNo){
        this(classNo);
    }

    public Teacher(int classNo) {
    }

    public int getCurrentPeriod(){
        return period;
    }

    //Set when a lesson is taught. Must be between 1 and 6
    public void setCurrentPeriod() {
        if (period > 6 || period < 1) {
            System.out.println("Not a valid value");
        } else {
            this.period = period;
        }
    }


    public void setCurrentLesson() {
        if (period > 6 || period < 1) {
            System.out.println("Not a valid value");
        } else {
            this.period = period;
        }
    }

    //Get the schedule for a teacher
    public void getSchedule(){
        System.out.println("Here is the schedule for " + Arrays.toString(teacher) + ":");
        for(int i = 0; i < teacher.length; i++) {
            System.out.println(Arrays.toString(teacher) + ": " + Arrays.toString(classNo));
            System.out.println("Subject: " + Arrays.toString(Subject));
            System.out.println("Period: " + period);
        }

    }
}
