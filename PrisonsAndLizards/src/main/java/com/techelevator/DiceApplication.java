package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class DiceApplication {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the dice application for Prisons and Lizards");
        System.out.println("                 ___====-_  _-====___\n" +
                "           _--^^^#####//      \\\\#####^^^--_\n" +
                "        _-^##########// (    ) \\\\##########^-_\n" +
                "       -############//  |\\^^/|  \\\\############-\n" +
                "     _/############//   (@::@)   \\\\############\\_\n" +
                "    /#############((     \\\\//     ))#############\\\n" +
                "   -###############\\\\    (oo)    //###############-\n" +
                "  -#################\\\\  / VV \\  //#################-\n" +
                " -###################\\\\/      \\//###################-\n" +
                "_#/|##########/\\######(   /\\   )######/\\##########|\\#_\n" +
                "|/ |#/\\#/\\#/\\/  \\#/\\##\\  |  |  /##/\\#/  \\/\\#/\\#/\\#| \\|\n" +
                "`  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '\n" +
                "   `   `  `      `   / | |  | | \\   '      '  '   '\n" +
                "                    (  | |  | |  )\n" +
                "                   __\\ | |  | | /__\n" +
                "                  (vvv(VVV)(VVV)vvv)");


        System.out.println("Please use only whole numbers.    ");
        Random random = new Random();
        System.out.print("How many dice would you like to roll?  ");
        String diceQtyInput = userInput.nextLine();
        int numberOfDice = Integer.parseInt(diceQtyInput);

        System.out.print("How many sides do we need?   ");
        String manySidesOfDice = userInput.nextLine();
        int sidesToDice = random.nextInt(1, Integer.parseInt(manySidesOfDice)) + 1;



        System.out.print("What is your modifier?  Please include the + or - (example: +4 or -2):   ");
        String plusOrMinusSkill = userInput.nextLine();
        int skillModifier = Integer.parseInt(plusOrMinusSkill);

        List<Integer> listOfSides = new ArrayList<>();
        if (Integer.parseInt(diceQtyInput) >= 1) {
            for (int i = 0; i < Integer.parseInt(diceQtyInput); i++) {
                int newRandomNumber = random.nextInt(1,Integer.parseInt(manySidesOfDice) +1);
                listOfSides.add(newRandomNumber);
            }
        }

        int rollResult = 0;
        for (int side : listOfSides) {
            int totalWithModifier = side + skillModifier;
            rollResult += totalWithModifier;

        }

        System.out.println("You rolled:  " +
                "" + rollResult + "   Dice results: " + listOfSides + " + " +  " " + skillModifier);









    }

//}
//
//class Demo {

}
