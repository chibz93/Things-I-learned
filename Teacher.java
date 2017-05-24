package com.company;

/**
 * Created by Chibuzo Nwobiri on 04/04/2017. Here, I'm trying to chain constructors
 */
public class Teacher extends School {
    private String teacher;
    private String lesson;
    private int classNo;
    private int period;

    public Teacher(){
        this.classNo = classNo;
        this.teacher = teacher;
        this.lesson = lesson;
    }

    public Teacher(String teacher, int classNo){
        this(classNo);
    }

    public Teacher(int classNo) {
    }

    public int getCurrentPeriod(){
        return period;
    }

    public void setCurrentPeriod() {
        if (period > 6 || period < 1) {
            System.out.println("Not a valid value");
        } else {
            this.period = period;
        }
    }

    public String getCurrentLesson(){
        return lesson;
    }

    public void setCurrentLesson() {
        if (period > 6 || period < 1) {
            System.out.println("Not a valid value");
        } else {
            this.period = period;
        }
    }

    public Timetable(){

    }
}
