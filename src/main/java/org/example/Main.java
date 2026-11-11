package org.example;

public class Main {

    public static void main(String[] args) {

        // Выводим текст: Hello, world! в консоль
        System.out.println("Hello, world!");

        // Переменные: ссылочные и примитивные

        // Примитивные:
        // Целочисленные
        byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1;

        // Дробные
        float fl = 1.0f;
        double d = 1.0d;

        // Логические
        boolean bool = true;
        boolean ean = false;

        // Символ
        char ch = 'f';

        // Вывод в консоль переменной "b"
        System.out.println("Переменная b имеет значение: " + b);


        // TODO написать реализацию вывода в консоль значений переменных sh i l fl d bool ch;

        System.out.println("Переменная sh имеет значение: " + sh);
        System.out.println("Пременная i имеет значение: " + i);
        System.out.println("Переменная l имееет значение: " + l);
        System.out.println("Переменная fl имеет значение: " + fl);
        System.out.println("Переменная d имеет значение: " + d);
        System.out.println("Переменная bool имеет значение: " + bool);
        System.out.println("Переменная ean имеет значение: " + ean); // была проба вывести переменную со значением false
        System.out.println("Переменная ch имеет значение: " + ch);

        // Вывод в консоль диапазона byte
        System.out.println("Диапазон byte: min: " + Byte.MIN_VALUE + ", max: " + Byte.MAX_VALUE);

        // TODO написать реализацию вывода в консоль текста с диапазонами для short, int, long, float, double, boolean

        // Вывод в консоль диапазона short (целочисленные переменная)
        System.out.println("Диапазон short: min: " + Short.MIN_VALUE + ", max: " + Short.MAX_VALUE);

        // Вывод в консоль диапозна Integer (целочисленные переменная)
        System.out.println("Диапазон int: min:" + Integer.MIN_VALUE + ", max: " + Integer.MAX_VALUE);

        // Вывод в консоль диапозона long (целочисленные переменная)
        System.out.println("Диапазон long: min: " + Long.MIN_VALUE + ", max: " + Long.MAX_VALUE);

        // Вывод в консоль диапозона float (дробь)
        System.out.println("Диапазон float: min: " + Float.MIN_VALUE + ", max: " + Float.MAX_VALUE);

        // Вывод в консоль диапозона double (дробь)
        System.out.println("Диапазон double: min: " + Double.MIN_VALUE + ", max: " + Double.MAX_VALUE);

        // Вывод в консоль диапозона boolean (T/F)
        System.out.println("Диапазон boolean: true: " + Boolean.TRUE + " false: " + Boolean.FALSE);

        // Вывод в консоль диапазона char ('символ?') странный диапазон вышел
        System.out.println("Диапазон char: min: " + Character.MIN_VALUE + ", max: " + Character.MAX_VALUE);
    }
}