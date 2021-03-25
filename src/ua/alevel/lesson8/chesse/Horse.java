package ua.alevel.lesson8.chesse;

public class Horse {
    static int horsePointX;
    static int horsePointY;

    // Метод для установки коня
    public static void setHorse(int setX, int setY) {
        //Проверяем возможность установки коня
        if ((setX >= 0 && setX <= 7) && (setY >= 0 && setY <= 7)) {
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
        if ((horsePointX + moveX >= 0 && horsePointX + moveX <= 7)
                &&
                (horsePointY + moveY >= 0 && horsePointY + moveY <= 7)){
            inDesk = true;
        } else {
            System.out.println("Перемещение коня за границы доски невозможно!");
            inDesk = false;
            return;
        }

        //Проверяем возможно ли перемещение и перемещаем
        if ((inDesk == true) && (moveX == 1 && moveY == 2) || (moveX == 2 && moveY == 1)){
            System.out.println("Конь перемещен на X: " + (horsePointX + moveX) + ", Y: " + (horsePointY + moveY));
            horsePointX = horsePointX + moveX;
            horsePointY = horsePointY + moveY;
        } else {
            System.out.println("Недопустимый ход для коня");
        }
    }
}
