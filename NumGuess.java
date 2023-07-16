import java.util.Scanner;
import java.util.Random;
//Number Guessing Game
//take 60 as a hidden number
public class NumGuess {
    public static void main(String[] args) {
        int num;
        int trial=0;


        Scanner sc = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("Welcome To The Number Guessing Game");
        System.out.println("************************************");
        do {


            System.out.println("The Number is Between 1 To 100");
            System.out.println("HINT:Number is divisible by 12");
            System.out.println("Enter the Number:");
            num = sc.nextInt();
            System.out.println("you Entered the Number:"+num);
            if(num==60){

                System.out.println("------------------------------------------");
                System.out.println("Congratualtions, You Entered Correct number!!");
                trial+=1;
            }
            else if (num>60) {
                System.out.println("------------------------------------------");
                System.out.println("This is Higher Number than Hidden number!!");
                System.out.println("Keep Try!");
                System.out.println("------------------------------------------");
                trial+=1;


            }
            else if (num<60) {
                System.out.println("------------------------------------------");
                System.out.println("This is Lower Number than Hidden number");
                System.out.println("keep Try!");
                System.out.println("------------------------------------------");
                trial+=1;

            }
            System.out.println("Total Attempts:"+trial);
        } while (num!=60);







    }
}
