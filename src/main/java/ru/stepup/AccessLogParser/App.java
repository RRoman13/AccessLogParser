package ru.stepup.AccessLogParser;

import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("1 Курсовое задание - арифм. операции с 2-мя операндами");

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



        System.out.println("-----------------------------------------");
        System.out.println("2 Курсовое задание - по теме 'Циклы'");
        // 2 Курсовое задание - по теме "Циклы"
        //Напишите код, который при помощи операторов “if” и “else” будет проверять обе созданные boolean-переменные и:
        // 1. Если указанный файл не существует или указанный путь является путём к папке, а не к файлу,
        // то выводить в консоль информацию об этом и продолжать цикл при помощи оператора “continue”.

        // 2. Если указанный путь ведёт к существующему файлу, то выводить в консоль сообщение “Путь указан верно”,
        // а также подсчитывать и выводить общее количество верно указанных путей к файлам в формате:
        // “Это файл номер N”, где N — порядковый номер верно указанного файла, начиная с единицы.
        // Отправьте сделанные вами изменения в ваш репозиторий в ветку master.

        // Кейсы для file.exists() и file.isDirectory() возможны только такие:
        // true,true || true,false || false, false

        System.out.println("Укажите ниже путь к файлу или директории:");
        for (int i = 1; ; ) {

            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists(); //Переменная будет=true, если файл существует, и false, если не существует.
            boolean isDirectory = file.isDirectory(); //true, если это папка, и false, если это путь к файлу в папке

            if (!fileExists || isDirectory) {
                System.out.println("файл не существует или указанный путь является путём к папке");
                System.out.println("Снова укажите путь к файлу или директории:");
                continue; // Если if верно, то continue отправляет цикл в следующую итерацию,
                            // минуя строки ниже (это вместо else)
            }
            System.out.println("Путь указан верно");
            System.out.println("Это файл номер " + i);
            i++;
            System.out.println("Снова укажите путь к файлу или директории:");
        }
    }
}