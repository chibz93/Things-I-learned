package com.company;

/**
 * Created by Chibuzo Nwobiri on 23/03/2017.
 */
public class Test {
    public static void main(String[] args) {
       int myNum = 3;
       int yourNum;
       yourNum = 5;
       int thisNum = yourNum + myNum;
       System.out.println("My number is: " + thisNum);

       //Different primitive types
       byte age = 23;
       System.out.println("My age is: " + age);

       long debt = 100000000000000L;
       System.out.println(debt);

       double vat = 17.5;
       char letter = 'a';
       System.out.println("This is " + letter + " VAT of: " + vat + "%");
       System.out.println("The total price is: " + yourNum + vat / 100);

       //ASCII notation for a colon
       char colon= '\u003A'; // = ":"
       System.out.println(colon);

       int one = 10;
       int two = one;
       one = 5;
       System.out.println(one);

       System.out.println(9+5);
       System.out.println(9-5);
       System.out.println(9*5);
       System.out.println(9/5);
       System.out.println(9%5);

       int value1 = 3;
       int value2 = 6;
       int value3 = 4;
       int value4 = 7;

       int answer1 = (value1 + value2) / value3;
       int answer2 = value3 - value4 * value1;
       System.out.println(answer1);
       System.out.println(answer2);

       //Implicit conversions
       int normalNo = 100;
       long convNo = normalNo;

       //Explicit conversions
       long conNo = 100;
       int normNo = (int) conNo;

       float floatNo = 9.4f;
       double doubleNo = 12.3d;
       //Answer as a float
       float answer = (float)doubleNo + floatNo;
       //Answer as a double
       double answerDouble = doubleNo + floatNo;
       System.out.println(answer);
       System.out.println(answerDouble);

       //Conditional assignment
       int numb1 = 6;
       int numb2 = 5;
       int biggerNo = numb1 > numb2 ? numb1 : numb2;
       System.out.println(biggerNo);

       //if/else if/else statements
       int numb3 = 7;
       int numb4 = 10;
       if(numb3 > numb4){
           System.out.println(numb3 + " is the larger number");
       }
       else{
           System.out.println(numb4 + " is the larger number");
       }

       //Nested ifs
        byte a = 10;
        byte b = 12;
        if(a == 10)
            if(b > a + 1){
            System.out.println("a is " + a);
            }
            else{
                System.out.println(b + " is greater than 12");
            }

       //Logical operators + conversions
       boolean isJava = false;
       int x = 30;
       int y = 15;
       int z = x + y;
            if(isJava & z < 40)
               System.out.println("This is Java, but the number is greater than 40");
               if(!isJava ^ z > 40)
                  System.out.println("This may/may not be Java, but the number is greater than 40");

               if(isJava | z < 40)
                  System.out.println("This is Java, but the number may/may not be less than 40");

               else{
                   System.out.println("This is probably not Java");
               }
               System.out.println(isJava);


        //While loop
        int number1 = 1;
        int number2 = 2;
        int ans = 0;
        while (number1 < 10) {
            ans = number1 * number2;
            number1++;
            System.out.println(ans);
        }

        //Do-while loop
        do{
            System.out.print(number1);
            System.out.print(" x 10 = ");
            ans = number1 * 10;
            number1++;
            System.out.println(ans);
        }while(number1 < 15);

        //For loop
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                i = i + 1;
                j = j * 2;
                System.out.println(i + j);
            }
        }

        //Arrays
        int[] myNumbers = {20,50,70,35,40};
        System.out.println("My number is: " + myNumbers[2]);

        //Switch
        char vowel = 'y';
        switch (vowel){
            case 'a':
                System.out.println("This vowel is: " + vowel);
                break;
            case 'e':
                System.out.println("This vowel is: " + vowel);
                break;
            case 'i':
                System.out.println("This vowel is: " + vowel);
                break;
            case 'o':
                System.out.println("This vowel is: " + vowel);
                break;
            case 'u':
                System.out.println("This vowel is: " + vowel);
                break;
            case 'y':
                System.out.println("This letter : " + vowel + " could sometimes be considered a vowel");
                break;
            default:
                System.out.println("This is not a vowel. This is either blank or a consonant");
                break;
        }

       }
}
