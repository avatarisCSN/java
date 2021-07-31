package bpplab2;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        int numerical;
        double result;
        do {
            System.out.println("¬едите 1 число");
            Scanner scanner1 = new Scanner(System.in);
            double number1 = scanner1.nextDouble();
            System.out.println("¬ведите 2 число ");
            Scanner scanner2 = new Scanner(System.in);
            double number2 = scanner2.nextDouble();
            System.out.println("1 - сложение ");
            System.out.println(" 2 - вычитание ");
            System.out.println("  3 - умножение ");
            System.out.println("   4 деление   ");
            System.out.println("5 - выход ");
            Scanner scannernomerPunkta = new Scanner(System.in);
             numerical = scannernomerPunkta.nextInt();
            switch (numerical) {
                case 1:
                    result= number1+number2;
                    System.out.println(result);
                    break;

                case 2:
                    result = number1-number2;
                    System.out.println(result);
                    break;

                case 3:
                    result = number1*number2;
                    System.out.println(result);
                    break;
                case 4:
                    result = number1/number2;
                    System.out.println(result);
                    break;}

        } while (numerical<5);
    }
}
