import java.util.Scanner;

public class calculator {

        public static void main(String[] args) {

            Scanner userInput2 = new Scanner(System.in);
            System.out.println("Welcome to Johans simple multiplication and subtraction calculator!!");
            System.out.println("Do you wish to [M]ultiply or [S]ubtract");

            double tal1;
            double tal2;

            while (true) {

                String choiceMOrS = userInput2.next();

                if (choiceMOrS.equalsIgnoreCase("m")) {
                    System.out.println("Please enter the first number you wish to use for multiplication");
                    tal1 = userInput2.nextDouble();
                    System.out.println("Please enter the second number you wish to use for multiplication");
                    tal2 = userInput2.nextDouble();
                    multiply(tal1, tal2);
                    break;
                } else if (choiceMOrS.equalsIgnoreCase("s")) {
                    System.out.println("Please enter the number you wish to subtract from");
                    tal1 = userInput2.nextDouble();
                    System.out.println("Please enter the number you wish to subtract");
                    tal2 = userInput2.nextDouble();
                    subtract(tal1, tal2);
                    break;
                } else {
                    System.out.println("Please enter a valid choice M or S");
                }
            }
        }


        static double multiply(double tal1, double tal2){

           //Scanner userInput2 = new Scanner(System.in);
            double mAnswer;
            mAnswer = tal1 * tal2;

            System.out.println(tal1+" + "+tal2+" = "+mAnswer);
            System.out.println("Thanks for using Johans calc!");

            return mAnswer;
        }

        static double subtract(double tal1, double tal2){

            //Scanner userInput2 = new Scanner(System.in);
            double sAnswer;

            //Intentional error for testing in sAnswer
            sAnswer = tal1 - tal2 + 1;

            System.out.println(tal1+" - "+tal2+" = "+sAnswer);
            System.out.println("Thanks for using Johans calc!");

            return sAnswer;
        }



}
