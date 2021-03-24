package ua.alevel.lesson8.chesse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Point point = new Point();
        boolean inDesk;
        // Устанавливаем коня на шахматную доску
        Scanner sc = new Scanner(System.in);
        System.out.println("Установите коня:");
        System.out.println("Виберите точку по оси x");
        point.setX = sc.nextInt();
        System.out.println("Виберите точку по оси y");
        point.setY = sc.nextInt();
        System.out.println("Устанавливаем коня...");

        //Проверяем возможность установки коня
        if((point.setX >= 0 && point.setX <= 7) && (point.setY >= 0 && point.setY <= 7)){
            System.out.println("Конь установлен");
        } else {
            System.out.println("Невозможно установить коня за границами доски!");
        }

        //Запрашиваем координаты хода
        System.out.println("Выберите, куда хотите походить:");
        System.out.println("Виберите точку по оси x");
        point.moveX = sc.nextInt();
        System.out.println("Виберите точку по оси y");
        point.moveY = sc.nextInt();
        System.out.println("Перемещаем коня...");

        //Проверяем находится ли желаемое перемещение в границах доски
        if ((point.setX + point.moveX >= 0 && point.setX + point.moveX <= 7)
                &&
                (point.setY + point.moveY >= 0 && point.setY + point.moveY <= 7)){
            inDesk = true;
        } else {
            System.out.println("Перемещение коня за границы доски невозможно!");
            inDesk = false;
            return;
        }

        //Проверяем возможно ли перемещение
        if ((inDesk == true) && (point.moveX == 1 && point.moveY == 2) || (point.moveX == 2 && point.moveY == 1)){
            System.out.println("Конь перемещен на X: " + (point.setX + point.moveX) + ", Y: " + (point.setY + point.moveY));
        } else {
            System.out.println("Недопустимый ход для коня");
        }
    }
}
