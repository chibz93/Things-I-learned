package com.company;

/**
 * Created by Chibuzo Nwobiri on 11/05/2017.
 */
public class Lesson extends Teacher {
    private String subject;
    private int period;
    String[] Day = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    String[] Subject = new String[]{"English", "Maths", "Science", "History", "IT", "French", "Spanish"};

    public Lesson(){
        super();
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    public String[] setSubject(){
        for(int i = 0; i < Subject.length; i++) {
            if (i != Integer.parseInt(Day[0])) {
                i++;
            } else {
                this.subject = subject;
            }
        }
        return new String[0];
    }

    public String getDay(){
        return Day[];
    }

    public String[] setDay(){
        for(int i = 0; i < Subject.length; i++) {
            if (i != Integer.parseInt(Day[0])) {
                i++;
            } else {
                this.subject = subject;
            }
        }
        return new String[0];
    }

    public boolean hasAssignments(){
        boolean hasAssignments = false;
            for(int i = 0; i < Day.length; i++){

        }
    }
}
