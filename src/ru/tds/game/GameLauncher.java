package ru.tds.game;

/**
 * Класс, в котором реализован запуск игры.
 *
 * @author Trushenkov Dmitry 15IT18
 */
public class GameLauncher {

    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
