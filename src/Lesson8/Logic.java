package Lesson8;

import java.util.Random;


public class Logic {
    static int SIZE = 3;
    static int DOTS_TO_WIN = 3;
    static final char DOT_EMPTY = '•';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static char[][] map;
    static final Random rand = new Random();
    static boolean isGameFinished;
    static int whowin = 0;


    public static void go() {
        isGameFinished = false;

        if (checkWin(DOT_X)) {
            System.out.println("Победил человек");
            whowin = 1;
            isGameFinished = true;
            return;
        }
        if (isMapFull()) {
            System.out.println("Ничья");
            whowin = 3;
            isGameFinished = true;
            return;
        }
        aiTurn();
        printMap();
        if (checkWin(DOT_O)) {
            System.out.println("Победил Искуственный Интеллект");
            whowin = 2;
            isGameFinished = true;
            return;
        }
        if (isMapFull()) {
            System.out.println("Ничья");
            whowin = 3;
            isGameFinished = true;
            return;
        }
        isGameFinished = false;

    }

    public static boolean checkWin(char symb) {
        for (int col = 0; col < SIZE; col++) {
            for (int row = 0; row < SIZE; row++) {
                if (checkWinnerDiagonals(symb) || checkLanes(symb)) {
                    return true;
                }

            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int y, x;
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                if (isCellValid(i, j)) {
//                    map[i][j] = DOT_O;
//                    if (checkWin(DOT_O)) {
//                        return;
//                    }
//                    map[i][j] = DOT_EMPTY;
//                }
//
//            }
//
//        }
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                if (isCellValid(i, j)) {
//                    map[i][j] = DOT_X;
//                    if (checkWin(DOT_X)) {
//                        map[i][j] = DOT_O;
//                        return;
//                    }
//                    map[i][j] = DOT_EMPTY;
//                }
//            }
//        }
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                if (isCellValid(i, j)) {
//                    map[i][j] = DOT_O;
//                    if (checkWin(DOT_O) && Math.random() < 0.5) {
//                        return;
//                    }
//                    map[i][j] = DOT_EMPTY;
//                }
//            }
//
//        }

        do {
            y = rand.nextInt(SIZE);
            x = rand.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;


    }

    public static void humanTurn(int y, int x) {
        if (isCellValid(y, x)) {

            map[y][x] = DOT_X;
            go();
        }
    }

    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean checkWinnerDiagonals(char symb) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i = 0; i < SIZE; i++) {
            toright = toright & (map[i][i] == symb);
            toleft = toleft & (map[SIZE - i - 1][i] == symb);
        }
        if (toright || toleft) {
            return true;
        }
        return false;
    }

    static boolean checkLanes(char symb) {
        boolean cols, rows;
        for (int col = 0; col < SIZE; col++) {
            cols = true;
            rows = true;
            for (int row = 0; row < SIZE; row++) {
                cols = cols & (map[col][row] == symb);
                rows = rows & (map[row][col] == symb);
            }
            if (cols || rows) return true;
        }
        return false;
    }

}


