package com.techelevator;

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
        int sidesToDice = random.nextInt(Integer.parseInt(manySidesOfDice)) + 1;



        System.out.print("What is your modifier?  Please include the + or - (example: +4 or -2):   ");
        String plusOrMinusSkill = userInput.nextLine();
        int skillModifier = Integer.parseInt(plusOrMinusSkill);

        int rollResult = numberOfDice * sidesToDice + skillModifier;

        System.out.println("You rolled:  " +
                "" + rollResult + "   results: " + "(" + sidesToDice + "+" + skillModifier + ")");



    }

}
