package com.company;

public class Main {

    public static void main(String[] args) {
	//Sort of a calculator
    double num1 = 200.0d;
	double num2 = 10.0d;
	double num3 = 50.0d;
	double answer = 0.0d;
	char symbolA = '+';
	char symbolB = '+';

	switch(symbolA, symbolB){
	case '+','+':
	    answer = num1 + num2 + num3;
	}
    case '+','-':
        answer = num1 + num2 - num3;
    case '+', '*':
        answer = num1 + num2 * num3;
    case '+', '/':
        answer = num1 + num2 / num3;
    case '-', '+':
        answer = num1 - num2 + num3;
    case '-', '-':
        answer = num1 - num2 - num3;
    case '-', '*':
        answer = num1 - num2 * num3;
    case '-', '/':
        answer = num1 - num2 / num3;
    case '*', '+':
        answer = num1 * num2 + num3;
    case '*', '-':
        answer = num1 * num2 - num3;
    case '*', '*':
        answer = num1 * num2 * num3;
    case '*', '/':
        answer = num1 * num2 / num3;
    case '/', '+':
        answer = num1 / num2 + num3;
    case '/', '-':
        answer = num1 / num2 - num3;
    case '/', '*':
        answer = num1 / num2 * num3;
    case '/', '/':
        answer = num1 / num2 / num3;
        case '-':
	    answer = num1 - num2 - num3;
        case '*':
        answer = num1 * num2 * num3;
        case '/':
        if(num1 != 0.0d && num2 != 0.0d)
            answer = num1 / num2 / num3;
        else
        answer = 0.0d;
    System.out.println(answer);
    }

}
