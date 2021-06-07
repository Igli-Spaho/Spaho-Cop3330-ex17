//UCF COP3330 Summer 2021 Assignment 17 Solution
// *  Copyright 2021 Igli Spaho

//Sometimes you have to perform a more complex calculation based on some provided inputs and then use that result to make a determination.
//
//Create a program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time since your last drink. Calculate your blood alcohol content (BAC) using this formula
//
//BAC = (A × 5.14 / W × r) − .015 × H
//where
//
//A is total alcohol consumed, in ounces (oz).
//W is body weight in pounds.
//r is the alcohol distribution ratio:
//0.73 for men
//0.66 for women
//H is number of hours since the last drink.
//Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.
//
//Example Output
//Enter a 1 is you are male or a 2 if you are female: 1
//How many ounces of alcohol did you have? 3
//What is your weight, in pounds? 175
//How many hours has it been since your last drink? 1
//
//Your BAC is 0.049323
//It is legal for you to drive.
//
//
//Enter a 1 is you are male or a 2 if you are female: 1
//How many ounces of alcohol did you have? 5
//What is your weight, in pounds? 175
//How many hours has it been since your last drink? 1
//
//Your BAC is 0.092206
//It is not legal for you to drive.
//Constraint
//Prevent the user from entering non-numeric values.




import java.util.Scanner;

public class App {
    public static void main (String[]args){
        final double MEN = 0.73;
        final double FEMALE = 0.66;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a 1 if you are a male or a 2 if you are a female:");
        Integer male = in.nextInt();
        Integer female = in.nextInt();


        if(male==1 ){
            System.out.print("How many ounces of alcohol did you have?");
            Integer maleOunce = in.nextInt();

            System.out.print("What is your weight, in pounds?");
            Integer maleWeight = in.nextInt();

            System.out.print("How many hours has it been since your last drink?");
            Integer maleLastDrink = in.nextInt();

            final Double MALEBAC = (+maleOunce*5.14/maleWeight*MEN)- .015*maleLastDrink;

            System.out.println("Your BAC is "+String.format("%.6f",MALEBAC));
            if (MALEBAC<0.08){
                System.out.println("It is legal for you to drive");
            }
            else if (MALEBAC>0.08){
                System.out.println("It is illegal for you to drive");
            }

        }
            else if (female==2){
            System.out.print("How many ounces of alcohol did you have?");
            Integer femaleOunce = in.nextInt();

            System.out.print("What is your weight, in pounds?");
            Integer femaleWeight = in.nextInt();

            System.out.print("How many hours has it been since your last drink?");
            Integer femaleLastDrink = in.nextInt();

            final Double FEMALEBAC = (+femaleOunce*5.14/femaleWeight*FEMALE)- .015*femaleLastDrink;

            System.out.println("Your BAC is "+String.format("%.6f",FEMALEBAC));
            if (FEMALEBAC<0.08){
                System.out.println("It is legal for you to drive");
                }
            else if(FEMALEBAC>0.08){

                System.out.print("It is illegal for you to drive");
            }


        }
    }
}
