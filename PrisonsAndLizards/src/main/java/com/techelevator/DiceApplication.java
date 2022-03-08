package com.techelevator;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class DiceApplication {

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the dice application for Prisons and Lizards");
        System.out.println("""
                                 ___====-_  _-====___
                           _--^^^#####//      \\\\#####^^^--_
                        _-^##########// (    ) \\\\##########^-_
                       -############//  |\\^^/|  \\\\############-
                     _/############//   (@::@)   \\\\############\\_
                    /#############((     \\\\//     ))#############\\
                   -###############\\\\    (oo)    //###############-
                  -#################\\\\  / VV \\  //#################-
                 -###################\\\\/      \\//###################-
                _#/|##########/\\######(   /\\   )######/\\##########|\\#_
                |/ |#/\\#/\\#/\\/  \\#/\\##\\  |  |  /##/\\#/  \\/\\#/\\#/\\#| \\|
                `  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '
                   `   `  `      `   / | |  | | \\   '      '  '   '
                                    (  | |  | |  )
                                   __\\ | |  | | /__
                                  (vvv(VVV)(VVV)vvv)""");
        System.out.println();


        System.out.println("Please use only whole numbers.    ");
        System.out.println();
        Random random = new Random();
        System.out.print("How many dice would you like to roll?  ");
        System.out.println();
        String diceQtyInput = userInput.nextLine();
        int numberOfDice = Integer.parseInt(diceQtyInput);


        System.out.print("How many sides do we need?   ");
        System.out.println();
        String manySidesOfDice = userInput.nextLine();
//        int sidesToDice = random.nextInt(1, Integer.parseInt(manySidesOfDice)) + 1;

        while (Integer.parseInt(manySidesOfDice) <= 1) {
            System.out.println("ERROR There has to be at least 2 sides!");
            System.out.print("How many sides do we need?   ");
            manySidesOfDice = userInput.nextLine();
        }


        System.out.print("What is your modifier?  Please include the + or - (example: +4 or -2):   ");
        System.out.println();
        String plusOrMinusSkill = userInput.nextLine();
        int skillModifier = Integer.parseInt(plusOrMinusSkill);

        List<Integer> listOfSides = new ArrayList<>();
        if (Integer.parseInt(diceQtyInput) >= 1) {
            for (int i = 0; i < Integer.parseInt(diceQtyInput); i++) {
                int newRandomNumber = random.nextInt(1, Integer.parseInt(manySidesOfDice) + 1);
                listOfSides.add(newRandomNumber);
            }
        }

        int rollResult = 0;
        for (int side : listOfSides) {
            int totalWithModifier = side + skillModifier;
            rollResult += totalWithModifier;

        }

        System.out.println("You rolled:  " +
                "" + rollResult + "   Dice results: " + listOfSides + " + " + " " + skillModifier);
        System.out.println();

        for (int side : listOfSides) {
            if (numberOfDice == 1 && (side == 1)) {
                System.out.println("""
                                     __.-/|
                                     \\`o_O'
                                      =( )=  +-----+
                                        U|   | OMG |
                              /\\  /\\   / |   +-----+
                             ) /^\\) ^\\/ _)\\     |
                             )   /^\\/   _) \\    |
                             )   _ /  / _)  \\___|_
                         /\\  )/\\/ ||  | )_)\\___,|))
                        <  >      |(,,) )__)    |
                         ||      /    \\)___)\\
                         | \\____(      )___) )____
                          \\______(_______;;;)__;;;)""");
                break;
            } else {
                if (numberOfDice == 1 && (side == 20)) {
                    System.out.println("                            ==(W{==========-      /===-                        \n" +
                            "                              ||  (.--.)         /===-_---~~~~~~~~~------____  \n" +
                            "                              | \\_,|**|,__      |===-~___                _,-' `\n" +
                            "                 -==\\\\        `\\ ' `--'   ),    `//~\\\\   ~~~~`---.___.-~~      \n" +
                            "             ______-==|        /`\\_. .__/\\ \\    | |  \\\\           _-~`         \n" +
                            "       __--~~~  ,-/-==\\\\      (   | .  |~~~~|   | |   `\\        ,'             \n" +
                            "    _-~       /'    |  \\\\     )__/==0==-\\<>/   / /      \\      /               \n" +
                            "  .'        /       |   \\\\      /~\\___/~~\\/  /' /        \\   /'                \n" +
                            " /  ____  /         |    \\`\\.__/-~~   \\  |_/'  /          \\/'                  \n" +
                            "/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`                   \n" +
                            "                  \\_|      /        _) | ;  ),   __--~~                        \n" +
                            "                    '~~--_/      _-~/- |/ \\   '-~ \\                            \n" +
                            "                   {\\__--_/}    / \\\\_>-|)<__\\      \\                           \n" +
                            "                   /'   (_/  _-~  | |__>--<__|      |                          \n" +
                            "                  |   _/) )-~     | |__>--<__|      |                          \n" +
                            "                  / /~ ,_/       / /__>---<__/      |                          \n" +
                            "                 o-o _//        /-~_>---<__-~      /                           \n" +
                            "                 (^(~          /~_>---<__-      _-~                            \n" +
                            "                ,/|           /__>--<__/     _-~                               \n" +
                            "             ,//('(          |__>--<__|     /  NATURAL 20 YO!  .----_          \n" +
                            "            ( ( '))          |__>--<__|    |                 /' _---_~\\        \n" +
                            "         `-)) )) (           |__>--<__|    |               /'  /     ~\\`\\      \n" +
                            "        ,/,'//( (             \\__>--<__\\    \\            /'  //        ||      \n" +
                            "      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'       \n" +
                            "    `~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/                  \n" +
                            "  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~                    \n" +
                            "   ;'( ')/ ,)(                              ~~~~~~~~~~                         \n" +
                            "  ' ') '( (/                                                                   \n" +
                            "    '   '  `");
                    break;
                }

            }

        }

        System.out.println("Would you like to roll again?    Y/y or N/n  ");
        userInput.next();
        if(userInput.nextLine().equals("Y") || userInput.nextLine().equals("y")){
            System.out.println("Let's roll!");

        }
    }

}
