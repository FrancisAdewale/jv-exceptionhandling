package org.example;
import RestaurantManager.AddingNegativeIntegerException;
import RestaurantManager.InventoryManager;
import exercises.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int[] inputs;
//        inputs = Exercise2.getUserInput();
//        System.out.println(Exercise1.divide(inputs[0], inputs[1]));

//        Exercise4.recursiveMethod();
//          Exercise5.healthInsuranceDataInput();

//            Exercise5.healthInsuranceDataInput();

        InventoryManager im = new InventoryManager();
        try {
            im.addItem("Cabbage", 1);
        } catch (AddingNegativeIntegerException e) {
            System.out.println(e.getErrorDetail());
        }

        try {
            im.addItem("Potato", 0);
        } catch (AddingNegativeIntegerException e) {
            System.out.println(e.getErrorDetail());
            System.out.println(e.getMessage());
        }

        try {
            im.addItem("Eggs", -1);
        } catch (AddingNegativeIntegerException e) {
            System.out.println(e.getErrorDetail());
        }

        System.out.println(im.getInventory());
    }




}

