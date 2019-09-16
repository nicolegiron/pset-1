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

         final double diagonal = Math.sqrt((length*length) + (width*width));
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
        System.out.printf("%.2f%%.\n\n", answer);

        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */
         final double wage = 12.5;
         final double weeklyPay = (wage*7.5)+(wage*8)+(wage*10.5)+(wage*9.5)+(wage*6)+(wage*11.5);
         System.out.printf("$%.2f.\n", weeklyPay);

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

         final double salary = 117000;
         final double federal = .24;
         final double state = .0637;
         final double preTac401k = .07;

        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */



        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */



        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */



        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */



    }
}
