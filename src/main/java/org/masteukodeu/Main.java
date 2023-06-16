package org.masteukodeu;

import org.masteukodeu.tictactoe.TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();

        Scanner scanner = new Scanner(System.in);
        while (!ticTacToe.isFinished()) {
            printBoard(ticTacToe.getCurrentBoard());
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            ticTacToe.move(row, column);
            printBoard(ticTacToe.getCurrentBoard());
            ticTacToe.computerMove();
        }
    }

    private static void printBoard(char[][] currentBoard) {
        System.out.println(" --- ");
        for (char[] row : currentBoard) {
            System.out.print("|");
            System.out.print(row);
            System.out.println("|");
        }
        System.out.println(" --- ");
    }
}