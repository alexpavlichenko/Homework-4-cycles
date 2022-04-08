package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        {
            int i = 1;
            while (i <= 10 ) {
                System.out.print(i + " ");
                i++;
            }
            {
                System.out.println();
            }
            {
        for (int n = 10; n > 0; n-- ) {
            System.out.print(n + " ");
            }
            }
            {
                System.out.println();
            }
        }
        // Задание 2
        {
            for (int friday = 1; friday <= 31; friday = friday +7) {
                System.out.println("Today is the " + friday + "th - submit a report");
            }
        }
        // Задание 3
        {
            for ( int year = 0; year <= 2122;  year = year + 79) {
                if (year > 1822)
                System.out.println(year);
            }
        }
    }
}
