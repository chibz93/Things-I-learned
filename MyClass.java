package com.company;

/**
 * Created by Chibuzo Nwobiri on 02/04/2017.
 * The aim of this little project is to simulate adding students into different classrooms.
 * "If classes are full, then they are to be transferred into another class" is the basic
 * aim.
 */
public class MyClass extends School{
    private int classes;
    private int students;
    private int class1Seats;
    private int class2Seats;
    private int class3Seats;
    private int class4Seats;
    private int class5Seats;
    private int class6Seats;

    //initialize classrooms seats and no. of students
    public MyClass(){
        super.getTeacher();
        classes = 6;
        class1Seats = 0;
        class2Seats = 0;
        class3Seats = 0;
        class4Seats = 0;
        class5Seats = 0;
        class6Seats = 0;
        students = 180;
    }

    private boolean class1HasSeats(){
        return class1Seats < 30;
    }

    private boolean class2HasSeats(){
        return class2Seats < 30;
    }

    private boolean class3HasSeats(){
        return class3Seats < 30;
    }

    private boolean class4HasSeats(){
        return class4Seats < 30;
    }

    private boolean class5HasSeats(){
        return class5Seats < 30;
    }

    private boolean class6HasSeats(){
        return class6Seats < 30;
    }


    //Show how many people are in Class 1
    public int getClass1Seats(){
        return class1Seats;
    }

    //Adds people into Class 1
    public void addToClass1(){
        getClass1Seats();
        if (class1HasSeats()){
            class1Seats++;
            students--;
            System.out.println(class1Seats);
        }
        if(!class1HasSeats()){
            classIsFull();
        }
    }

    //Show how many people are in Class 2
    public int getClass2Seats(){
        return class2Seats;
    }

    //Adds people into Class 2
    public void addToClass2(){
        if (class2HasSeats()){
            class2Seats++;
            students--;
            System.out.println(class2Seats);
        }
        if(!class2HasSeats()){
            classIsFull();
            return;
        }
    }

    //Show how many people are in Class 3
    public int getClass3Seats(){
        return class3Seats;
    }

    //Adds people into Class 3
    public void addToClass3(){
        if(class3HasSeats()){
            class3Seats++;
            students--;
            System.out.println(class3Seats);
        }
        if(!class3HasSeats()){
            classIsFull();
            return;
        }
    }

    //Show how many people are in Class 4
    public int getClass4Seats(){
        return class4Seats;
    }

    //Adds people into Class 4
    public void addToClass4(){
        if (class4HasSeats()){
            class4Seats++;
            students--;
            System.out.println(class4Seats);
        }
        if(!class4HasSeats()){
            classIsFull();
            return;
        }
    }

    //Show how many people are in Class 5
    public int getClass5Seats(){
        return class5Seats;
    }

    //Adds people into Class 5
    public void addToClass5(){
        if (class5HasSeats()){
            class5Seats++;
            students--;
            System.out.println(class5Seats);
        }
        if(!class5HasSeats()){
            classIsFull();
            return;
        }
    }

    //Show how many people are in Class 6
    public int getClass6Seats(){
        return class6Seats;
    }

    //Adds people into Class 6
    public void addToClass6(){
        if (class6HasSeats()){
            class6Seats++;
            students--;
            System.out.println(class6Seats);
        }
        if(!class6HasSeats()){
            classIsFull();
            return;
        }
    }


    public void classIsFull(){
        System.out.println("This class is full");
    }
}
