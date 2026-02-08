package ru.stepup.AccessLogParser;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        System.out.println("Введите первое число: ");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("Сумма введенных чиисел равна = " + sum);

        int diff = firstNumber - secondNumber;
        System.out.println("Результат вычитания из первого второго числа = " + diff);

        int multiple = firstNumber * secondNumber;
        System.out.println("Произведение первого числа на второе = " + multiple);

        double quotient = (double)firstNumber / secondNumber;
        System.out.println("Частное первого числа на второе = " + quotient);
    }
}
