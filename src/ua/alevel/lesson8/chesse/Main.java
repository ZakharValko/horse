package ua.alevel.lesson8.chesse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Horse horse = new Horse();
        Board board = new Board();
        int setX;
        int setY;
        int moveX;
        int moveY;

        // Запрашиваем координаты для установки коня
        Scanner sc = new Scanner(System.in);
        System.out.println("Установите коня:");
        System.out.println("Виберите точку по оси x");
        setX = sc.nextInt();
        System.out.println("Виберите точку по оси y");
        setY = sc.nextInt();
        System.out.println("Устанавливаем коня...");
        // Устанавливаем коня
        horse.setHorse(setX, setY);
        board.setHorseOnBoard(setX, setY);
        // Запрашиваем координаты хода
        System.out.println("Выберите, куда хотите походить:");
        System.out.println("Виберите точку по оси x");
        moveX = sc.nextInt();
        System.out.println("Виберите точку по оси y");
        moveY = sc.nextInt();
        System.out.println("Перемещаем коня...");
        // Меняем координаты коня
        horse.moveHorse(moveX, moveY);
        // Перемещаем коня
        board.moveHorseOnBoard(horse.horsePointX, horse.horsePointY);
    }
}
