package com.company;

/**
 * Created by Chibuzo Nwobiri on 04/04/2017. Here, I'm trying to chain constructors
 */
public class Teacher {
    private String teacher;
    private String lesson;
    private int classNo;

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


}
