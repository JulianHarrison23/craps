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
                System.out.println("To play, please press <Enter> each turn to roll the dice! Good luck!");
            }
        }
        else{
            apple = false;
        }
        while(apple){
            System.out.println("Press <Enter> to roll...");
            Scanner pause = new Scanner(System.in);
            String pause1 = pause.nextLine();
            Die Die1 = new Die();
            Die Die2 = new Die();
            int roll11 = Die1.getRoll();
            int roll12 = Die2.getRoll();
            int sum1 = roll11+roll12;
            if (sum1 == 7 || sum1 == 11){
                System.out.println("Congrats, you rolled a " + roll11+ " and a "+ roll12+ " on your first roll. This totals to "+sum1+" meaning you win!");
            }
            else if (sum1 == 2 || sum1 == 3 || sum1 ==12){
                System.out.println("Sorry, you rolled a "+ roll11+ " and a "+ roll12 + " on your first roll. This totals to "+sum1+" meaning you lose!");
            }
            else{
                System.out.println("You rolled a "+ roll11+ " and a "+ roll12 + " on your first roll. Your point is "+sum1+".");
                System.out.println("Press <Enter> to roll...");
                pause1 = pause.nextLine();
                Die1.newRoll();
                Die2.newRoll();
                int roll21 = Die1.getRoll();
                int roll22 = Die2.getRoll();
                int sum2 = roll21 + roll22;
                while(sum2!=sum1&&sum2!=7){
                    System.out.println("You rolled a "+ roll21+ " and a "+ roll22 + " on your roll. This equals "+ sum2+". Your point is still "+sum1+".");
                    System.out.println("Press <Enter> to roll...");
                    pause1 = pause.nextLine();
                    Die1.newRoll();
                    Die2.newRoll();
                    roll21 = Die1.getRoll();
                    roll22 = Die2.getRoll();
                    sum2 = roll21 + roll22;
                }
                if(sum2==7){
                    System.out.println("Sorry, you rolled a "+ roll21+ " and a "+ roll22 + " on your roll. This totals to "+sum2+" meaning you lose!");
                }
                if (sum2==sum1){
                    System.out.println("You rolled a "+ roll21+ " and a "+ roll22 + " on your roll. This equals your point. Congrats on winning!");
                }
            }
            System.out.println("Play again?(y/n): ");
            a = input.next();
            if(a.equals("n")){
                apple = false;
            }
        }
    }
}
