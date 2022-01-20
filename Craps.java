/**
 * @author Julian Harrison
 */

import java.util.*;

public class Craps {
    public static void main(String[] args){
        System.out.print("Would you like to play craps? (y/n): ");
        Scanner input = new Scanner(System.in);
        String a = input.next();
        boolean apple = true;
        if(a.equals(("y"))){
            apple = true;
            System.out.print("Do you know how to play craps?(y/n): ");
            Scanner dad = new Scanner(System.in);
            String b = input.next();
            if(b.equals(("y"))){
            }
            else{
                System.out.println("The instructions are simple. On your first roll, you roll two die. If the sum is equal to 2, 3, or 12 then you lose. However, if your roll is 7 or 11 you win. If your sum is none of the above, then your sum becomes your 'point'. Your goal on your next rolls is to roll the two die to be equalivent to the first sum before rolling a 7. If a 7, is rolled first then you lose. On the contrary, if the sum is rolled first then you win!");
                System.out.println();
                System.out.println("To play, please press enter each turn to roll the dice! Good luck!");
            }
        }
        else{
            apple = false;
        }
    }
}
