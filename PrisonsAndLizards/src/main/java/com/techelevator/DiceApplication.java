package com.techelevator;

import java.util.Scanner;

public class DiceApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the dice application for Prisons and Lizards");
        System.out.println("====-_  _-====___\n" +
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
        System.out.print("How many dice would you like to roll?  ");
        int numberOfDice = Integer.parseInt(scanner.nextLine());

        System.out.print("How many sides do we need?   ");
        int sidesToDice = Integer.parseInt(scanner.nextLine());

        System.out.print("What is your modifier?  Please include the + or - (example: +4 or -2):   ");
        int skillModifier = Integer.parseInt(scanner.nextLine());



    }

}
