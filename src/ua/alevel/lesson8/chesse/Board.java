package ua.alevel.lesson8.chesse;

public class Board {
    static int[][] chessBoard = new int[8][8];

    public static void createBoard(int[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                chessBoard[i][j] = 0;
            }
        }
    }

    // Метод для установки коня на доске
    public static void setHorseOnBoard(int setX, int setY){
        chessBoard[setX - 1][setY - 1] = 1;
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
        chessBoard[setX - 1][setY - 1] = 0;
    }

    // Метод для перемещения коня на доске
    public static void moveHorseOnBoard(int x, int y) {
        chessBoard[x - 1][y - 1] = 1;
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
