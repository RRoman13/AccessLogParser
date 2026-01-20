package ru.stepup.AccessLogParser;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Введите текст и нажмите <Enter>:" );
        String text = new Scanner(System.in).nextLine();
        System.out.println("Длинна текста: " + text.length());
    }
}
