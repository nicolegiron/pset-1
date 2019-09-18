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
        final double INTOMM = 25.4;
        double lengthmm = LENGTH*INTOMM;
        double widthmm = WIDTH*INTOMM;
        double area = lengthmm*widthmm;
        System.out.printf("\n%,.2f square millimeters. \n\n", area);

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
         final double INTOCM = 2.54;
         double lengthcm = LENGTH*INTOCM;
         double widthcm = WIDTH*INTOCM;
         double perimeter = (lengthcm*2) + (widthcm*2);
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

        final double WEIGHTH = .15;
        final double WEIGHTQ = .35;
        final double WEIGHTT = .5;

        double homeworkweight = (homework1 + homework2 + homework3)*WEIGHTH/3;
        double quizweight = (quiz1 + quiz2 + quiz3)*WEIGHTQ/3;
        double testweight = (test1 + test2 + test3)*WEIGHTT/3;
        double answer = homeworkweight+quizweight+testweight;
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
         final double PRETAX401K = 1-.07;
         final double perPay = (SALARY/12)/2;
         final double before401K = perPay*FEDERAL*STATE;
         final double after401K = before401K*PRETAX401K;
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
         double buses = Math.ceil((STUDENTS+TEACHERS) / 54);
         double remainder = (STUDENTS+TEACHERS) % 54;
         System.out.printf("%.0f buses are needed, with ", buses);
         System.out.printf("%.0f passengers on the last bus.\n\n", remainder);

        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */

         final double LENGTH8 = 48;
         final double WIDTH8 = 24;
         final double DIAMETER = 6;
         final double squareArea = (48*24) - (Math.PI*Math.pow(3,2));
         System.out.printf("%,.2f square inches.\n\n", squareArea);


        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */

         int year1 = 2020;
         int year2 = 2100;
         int year3 = 2400;
         boolean y2020 = ((year1%4==0) && (year1%100!=0)) || (year1%400==0);
         System.out.println(year1 + " is a leap year..." + Y2020 + ".");
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
