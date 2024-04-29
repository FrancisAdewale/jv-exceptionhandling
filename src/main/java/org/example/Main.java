package org.example;
import exercises.Exercise1;
import exercises.Exercise2;

public class Main {

    public static void main(String[] args) {

        int[] inputs;
        inputs = Exercise2.getUserInput();
        System.out.println(Exercise1.divide(inputs[0], inputs[1]));

    }

}

