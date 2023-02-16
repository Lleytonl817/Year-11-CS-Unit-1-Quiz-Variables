public class Variables {

    public static void main(String[] args) {

        // 1.
        int age = 33;

        // 2.
        System.out.println(age);

        // 3.
        double balance = 18.89;

        // 4.
        int dollars = (int) balance;
        System.out.println(dollars);

        // 5.
        int dollarsRounded = (int) balance + 1;
        System.out.println(dollarsRounded);

        // 6.
        char letter = 'A';

        // 7.
        System.out.println(letter);
        // 8.
        System.out.println((int) letter);

        // 9.
        letter++;

        // 10.
        System.out.println(letter);

        // 11.
        System.out.println((int) letter);
        // 12.Focus your explanation on character data types and integers.
        /**
         * [we first created a variable char and set it to a letter. then in question 7, we just proved that our letter actually works.
         * I then used (int) to give the letter a integer. Next, I changed the letter value by using an increment, so it is now B instead of A.
         * Finally, I printed out the letter again under the new value and assigned it a number.]
         */

    }
}
