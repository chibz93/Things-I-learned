package com.company;

public class Main {

    public static void main(String[] args) {
	for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 10; j++) {
            i = i + 1;
            j = j * 2;
            System.out.println(i + j);
        }
    }
    }
}
