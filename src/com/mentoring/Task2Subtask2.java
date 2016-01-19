package com.mentoring;

/**
 * Created by Almas_Doskozhin on 1/19/2016.
 */
public class Task2Subtask2 {
    public static void main(String[] args) {
       caller1();
    }

    public static void caller1() {
       caller2();
    }

    public static void caller2() {
        caller1();
    }
}



