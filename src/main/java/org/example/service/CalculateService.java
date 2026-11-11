package org.example.service;

/**
 * Сервис для выполнения математических действий
 *
 * @author Kashirin Pavel
 */
public class CalculateService {

    /**
     * Суммирование полученных аргументов
     *
     * @param a первое значение
     * @param b второе значение
     * @return результат вычисления
     */
    public String sumArguments(double a, double b) {

        // Сложение аргументов
        double result = a + b;

        return String.format("Результат сложения: %s", result);
    }

    public String subtractionArguments(double a, double b) {
        // TODO сделать реализацию вычитания
        return null;
    }

    public String multiplicationArguments(double a, double b) {
        // TODO ну понятно да?)
        return null;
    }

    public String divArguments(double a, double b) {
        // TODO ну?)
        return null;
    }
}
