package com.company;

/**
 * Created by Chibuzo Nwobiri on 12/04/2017.
 */
public class School {
    private final int noOfClasses = 6;
    private String[] Teachers;
    private int classNo;

    public School(){
        String Teachers[] = new String[]{"Tim", "Zara", "Mike", "Trish", "Millie", "Clark"};
        int classNo[] = new int[]{1,2,3,4,5,6};
    }

    public String getTeacher(){
        return Teachers[3];
    }

    public void assignClassNo(){
        if(classNo > 6 || classNo < 1){
            System.out.println("Not a valid classroom number");
        }
        else
        this.classNo = classNo;
    }

    public void getTeacherClass(){
        StringBuilder st = new StringBuilder(50);
        String Teachers = "Tim";
        int classNo = 5;
        st.append("The teacher ");
        st.append(Teachers);
        st.append(" is currently in Class ");
        st.append(classNo);
    }

}
