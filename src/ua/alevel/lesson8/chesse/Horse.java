package ua.alevel.lesson8.chesse;

public class Horse {
    static int horsePointX;
    static int horsePointY;

    // Метод для установки коня
    public static void setHorse(int setX, int setY) {
        //Проверяем возможность установки коня
        if ((setX >= 1 && setX <= 8) && (setY >= 1 && setY <= 8)) {
            System.out.println("Конь установлен");
            horsePointX = setX;
            horsePointY = setY;
        } else {
            System.out.println("Невозможно установить коня за границами доски!");
        }
    }

    // Метод для перемещения коня
    public static void moveHorse(int moveX, int moveY){
        boolean inDesk;
        //Проверяем находится ли желаемое перемещение в границах доски
        if((moveX >= 1 && moveX <= 8) && (moveY >= 1 && moveY <= 8 )){
            inDesk = true;
        } else {
            System.out.println("Перемещение коня за границы доски невозможно!");
            inDesk = false;
            return;
        }

        //Проверяем возможно ли перемещение и перемещаем
        if ((inDesk) && (((moveX == horsePointX + 1 || moveX == horsePointX - 1) && (moveY == horsePointY + 2 || moveY == horsePointY - 2))
                || ((moveX == horsePointX + 2 || moveX == horsePointX - 2) && (moveY == horsePointY + 1 || moveY == horsePointY - 1)))){
            System.out.println("Конь перемещен на X: " + moveX + ", Y: " + moveY);
            horsePointX = moveX;
            horsePointY = moveY;
        } else {
            System.out.println("Недопустимый ход для коня");
        }
    }
}
