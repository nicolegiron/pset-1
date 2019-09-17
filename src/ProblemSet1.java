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

        final double length = 8.5;
        final double width = 11;
        final double lengthMM = length*25.4;
        final double widthMM = width*25.4;
        final double area = lengthMM*widthMM;
        System.out.printf("\n%,.2f square millimeters. \n\n", area);

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double lengthCM = length*2.54;
         final double widthCM = width*2.54;
         final double perimeter = (lengthCM*2) + (widthCM*2);
         System.out.println(perimeter + " centimeters.\n");

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

         final double diagonal = Math.hypot(length, width);
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

        final double weightH = .15;
        final double weightQ = .35;
        final double weightT = .5;

        final double homeworkWeight = (homework1 + homework2 + homework3)*weightH/3;
        final double quizWeight = (quiz1 + quiz2 + quiz3)*weightQ/3;
        final double testWeight = (test1 + test2 + test3)*weightT/3;
        final double answer = homeworkWeight+quizWeight+testWeight;
        System.out.printf("%,.2f%%.\n\n", answer);

        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */
         final double wage = 12.5;
         final double weeklyPay = (wage*7.5)+(wage*8)+(wage*10.5)+(wage*9.5)+(wage*6)+(wage*11.5);
         System.out.printf("$%.2f.\n\n", weeklyPay);

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

         final double salary = 117000;
         final double federal = 1 - .24;
         final double state = 1- .0637;
         final double preTax401k = 1- .07;
         final double perPay = (salary/12)/2;
         final double before401k = perPay*federal*state;
         final double after401k = before401k*preTax401k;
         System.out.printf("$%,.2f.\n\n", after401k);

        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */

         final double students = 273;
         final double teachers = 28;
         final double capacity = 54;
         final double buses = Math.ceil((students+teachers) / 54);
         final double remainder = (students+teachers) % 54;
         System.out.printf("%.0f buses are needed, with ", buses);
         System.out.printf("%.0f passengers on the last bus.\n\n", remainder);

        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */

         final double length8 = 48;
         final double width8 = 24;
         final double diameter = 6;
         final double squareArea = (48*24) - (Math.PI*Math.pow(3,2));
         System.out.printf("%,.2f square inches.\n\n", squareArea);


        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */

         final int year1 = 2020;
         final int year2 = 2100;
         final int year3 = 2400;
         final boolean y2020 = ((year1%4==0) && (year1%100!=0)) || (year1%400==0);
         System.out.println(year1 + " is a leap year..." + y2020);
         final boolean y2100 = ((year2%4==0) && (year2%100!=0)) || (year2%400==0);
         System.out.println(year1 + " is a leap year..." + y2100);
         final boolean y2400 = ((year3%4==0) && (year3%100!=0)) || (year3%400==0);
         System.out.println(year1 + " is a leap year..." + y2400 + "\n");


        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */

          final double windChill = 35.74 + (0.6215*38) + ((0.4275*38) - 35.75) * Math.pow(14, 0.16);
          System.out.printf("%.1f degrees.\n", windChill);


    }
}
