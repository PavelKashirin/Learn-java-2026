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

        // Символ
        char ch = 'f';

        // Вывод в консоль переменной "b"
        System.out.println("Переменная b имеет значение: " + b);

        // TODO написать реализацию вывода в консоль значений переменных sh i l fl d bool ch;

        // Вывод в консоль диапазона byte
        System.out.println("Диапазон byte: min: " + Byte.MIN_VALUE + ", max: " + Byte.MAX_VALUE);

        // TODO написать реализацию вывода в консоль текста с диапазонами для short, int, long, float, double, boolean

    }
}