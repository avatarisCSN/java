package bpplab2;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        int numerical;
        double result;
        do {
            System.out.println("������ 1 �����");
            Scanner scanner1 = new Scanner(System.in);
            double number1 = scanner1.nextDouble();
            System.out.println("������� 2 ����� ");
            Scanner scanner2 = new Scanner(System.in);
            double number2 = scanner2.nextDouble();
            System.out.println("1 - �������� ");
            System.out.println(" 2 - ��������� ");
            System.out.println("  3 - ��������� ");
            System.out.println("   4 �������   ");
            System.out.println("5 - ����� ");
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
