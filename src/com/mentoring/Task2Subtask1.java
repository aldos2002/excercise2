package com.mentoring;

public class Task2Subtask1 {

    public static void main(String[] args) {
        Unit highlander = new Unit(0);
        Unit first = highlander;
        Unit second;
        int i = 1;
        while (true){
            second = new Unit(i);
            second.setUnit(first);
            first.setUnit(second);
            first = second;
            i++;
        }
    }
}
