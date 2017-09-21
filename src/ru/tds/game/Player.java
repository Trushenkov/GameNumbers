package ru.tds.game;

/**
 * Класс, в котором реализовано генерирование чисел для игроков.
 *
 * @author Trushenkov Dmitry 15IT18
 */
public class Player {

    int number = 0;

    /**
     * Метод для генерирования рандомного значения для переменой number.
     */
    public void guess() {
        number = (int) (Math.random() * 10);
    }

    /**
     * Метод для вывода предполагаемого числа.
     */
    public void writeNumber() {
        System.out.println("Я предполагаю " + number);
    }
}
