package com.company;

import java.util.Arrays;

/**
 * Created by Chibuzo Nwobiri on 11/05/2017.
 */
public class Student extends School{
    //Some arrays that were used for gathering data and making "timetables"
    String[] name = new String[]{"Joey", "Melanie", "Marc", "Jessie", "Mike"};
    int[] year = new int[]{7,8,9,10,11};
    String[] Subject = new String[]{"English", "Maths", "Science", "History", "IT", "French", "Spanish"};
    String[] Grade = new String[]{"A","B","C","D","E"};
    int [] period = {1,2,3,4,5};

    public Student(){
        this.name = name;
    }

    //Get the schedule for a student
    public void timeTable(){
        System.out.println("Here is the timetable for " + Arrays.toString(name) + ":");
        System.out.println("Subject: " + Arrays.toString(Subject));
        System.out.println("Period: " + Arrays.toString(period));
    }

    public void getGrades(){
        System.out.println("Here are the grades for " + Arrays.toString(name) + ":");
        for(int i = 0; i < name.length; i++) {
            System.out.println(Arrays.toString(Subject) + ": " + Arrays.toString(Grade));
        }
    }
}
