/*
2018 is not a leap year  since 2018 / 4 = 504.5
2020 is not a leap year since 2020 / 4 = 505
2000 is a leap year since 2000 / 4 = 500, 2000 / 100 = 40, and 2000 / 400 = 5
1900 is not a leap year since 1900 / 4 =  475, 1900 / 100 = 19, but 1900 / 400 = 4.75
 */

import java.util.Scanner;
public class LeapYear {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter a year: ");
            int year = in.nextInt();

            //2000 is a leap year since 2000 / 4 = 500, 2000 / 100 = 40, and 2000 / 400 = 5

            if (((year%4) == 0 ) && ((year%40) == 0 ) && ((year%400) == 0 )){
                System.out.println(year +  " is  a leap year");
            } else
                System.out.println(year +  " is not a leap year");
        }
    }

