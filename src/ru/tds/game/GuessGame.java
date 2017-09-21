package ru.tds.game;

/**
 * Класс, в котором реализована сама игра. То есть вывод предолагаемого числа, а также чисел которые предположили игроки.
 * Проверка чисел на совпадение с предполагаемым числом, завершение игры если кто-то из игроков угадал это число.
 *
 * @author Trushenkov Dmitry 15IT18
 */

public class GuessGame {

    Player player1, player2, player3;

    /**
     * Метод, в котором происходит объявление и создание игроков, генерирование предполагаемого числа,
     * сравнивание чисел игроков с предполагаемым числом и завершение игры, если кто-то из них угадал число.
     */
    public void startGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();
        int guessPlayer1, guessPlayer2, guessPlayer3;
        boolean player1isRight = false;
        boolean player2isRight = false;
        boolean player3isRight = false;

        int targetNumber = (int) (Math.random() * 10);

        System.out.println(" Я думаю это число между 0 и 9...");
        while (true) {

            System.out.println("Предполагаемое число - " + targetNumber);
            player1.guess();
            player2.guess();
            player3.guess();

            guessPlayer1 = player1.number;
            System.out.println("Первый игрок предположил, что это число " + guessPlayer1);
            guessPlayer2 = player2.number;
            System.out.println("Второй игрок предположил, что это число " + guessPlayer2);
            guessPlayer3 = player3.number;
            System.out.println("Третий игрок предположил, что это число " + guessPlayer3);

            if (guessPlayer1 == targetNumber) {
                player1isRight = true;
            }
            if (guessPlayer2 == targetNumber) {
                player2isRight = true;
            }
            if (guessPlayer3 == targetNumber) {
                player3isRight = true;
            }
            if (player1isRight || player2isRight || player3isRight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок прав? " + player1isRight);
                System.out.println("Второй игрок прав? " + player2isRight);
                System.out.println("Третий игрок прав? " + player3isRight);
                System.out.println("Игра закончена");
                break;
            } else {
                System.out.println("Игрокам придется попробовать еще раз.");
            }
        }
    }

}
