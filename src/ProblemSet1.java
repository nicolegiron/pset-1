/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {
    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

        final double LENGTH = 8.5;
        final double WIDTH = 11;
        final double IN_TO_MM = 25.4;
        double lengthMm = LENGTH*IN_TO_MM;
        double widthMm = WIDTH*IN_TO_MM;
        double area = lengthMm*widthMm;
        System.out.printf("\n%,.2f square millimeters. \n\n", area);

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
         final double IN_TO_CM = 2.54;
         double lengthCm = LENGTH*IN_TO_CM;
         double widthCm = WIDTH*IN_TO_CM;
         double perimeter = (lengthCm*2) + (widthCm*2);
         System.out.println(perimeter + " centimeters.\n");

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

         double diagonal = Math.hypot(LENGTH, WIDTH);
         System.out.printf("%.2f inches.\n\n", diagonal);

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;

        final double WEIGHT_H = .15;
        final double WEIGHT_Q = .35;
        final double WEIGHT_T = .5;

        double homeworkWeight = (homework1 + homework2 + homework3)*WEIGHT_H/3; /*Adding all of the grades then
          multiplying by the weight which is already in decimal form then AFTER multiply by 3*/
        double quizWeight = (quiz1 + quiz2 + quiz3)*WEIGHT_Q/3;
        double testWeight = (test1 + test2 + test3)*WEIGHT_T/3;
        double answer = homeworkWeight+quizWeight+testWeight;
        System.out.printf("%,.2f%%.\n\n", answer);

        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */
         final double WAGE = 12.5;
         double weeklyPay = (WAGE*7.5)+(WAGE*8)+(WAGE*10.5)+(WAGE*9.5)+(WAGE*6)+(WAGE*11.5);
         System.out.printf("$%.2f.\n\n", weeklyPay);

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

         final double SALARY = 117000;
         final double FEDERAL = 1-.24;
         final double STATE = 1-.0637;
         final double PRE_TAX_401K = 1-.07; /*all of the taxes are in decimal then subtracted by 1 so the variable
            can later be multiplied by salary*/
         final double perPay = (SALARY/12)/2;
         final double before401K = perPay*FEDERAL*STATE; //Muliply all taxes with the salary
         final double after401K = before401K*PRE_TAX_401K; /*After all of the taxes, apply the pre 401k since the code
           is working backwards to find the take-home pay check*/
         System.out.printf("$%,.2f.\n\n", after401K);

        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */

         final double STUDENTS = 273;
         final double TEACHERS = 28;
         final double CAPACITY = 54;
         double buses = Math.ceil((STUDENTS+TEACHERS) / CAPACITY);
         double remainder = (STUDENTS+TEACHERS) % 54;
         System.out.printf("%.0f buses are needed, with ", buses);
         System.out.printf("%.0f passengers on the last bus.\n\n", remainder);

        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */

         final double LENGTH_8 = 48;
         final double WIDTH_8 = 24;
         final double DIAMETER = 6;
         final double squareArea = (LENGTH_8*WIDTH_8) - (Math.PI*DIAMETER);
         System.out.printf("%,.2f square inches.\n\n", squareArea);


        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */

         int year1 = 2020;
         int year2 = 2100;
         int year3 = 2400;
         boolean y2020 = ((year1%4==0) && (year1%100!=0)) || (year1%400==0); /*Finding if the year%4=0 and the year%100
           does not equal 0, both of those have to be true, or if the year%400=0, if either of those are correct then
           the boolean equals true*/
         System.out.println(year1 + " is a leap year..." + y2020 + ".");
         boolean y2100 = ((year2%4==0) && (year2%100!=0)) || (year2%400==0);
         System.out.println(year2 + " is a leap year..." + y2100 + ".");
         boolean y2400 = ((year3%4==0) && (year3%100!=0)) || (year3%400==0);
         System.out.println(year3 + " is a leap year..." + y2400 + ".\n");


        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */

          double windChill = 35.74 + (0.6215*38) + ((0.4275*38) - 35.75) * Math.pow(14, 0.16);
          System.out.printf("%.1f degrees.\n", windChill);

    }
}
