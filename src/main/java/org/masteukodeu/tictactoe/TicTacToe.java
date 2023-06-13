package org.masteukodeu.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    private char[][] board = new char[][]{
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '},
    };

    public Object[] getCurrentBoard() {
        return board;
    }

    public void computerMove() {
        List<Move> possibleMoves = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            char[] row = board[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] == ' ') {
                    possibleMoves.add(new Move(i, j));

                }
            }
        }

        System.out.printf("%s possible moves found %n", possibleMoves.size());

        List<Move> winningMoves = new ArrayList<>();
        for (Move move : possibleMoves) {
            if (isWinningMove(move)) {
                winningMoves.add(move);
            }
        }

        System.out.printf("%s winning moves found %n", winningMoves.size());

        if (!winningMoves.isEmpty()) {
            Move move = winningMoves.get(0);
            board[move.i()][move.j()] = 'X';
        } else if (!possibleMoves.isEmpty()) {
            Move move = possibleMoves.get(0);
            board[move.i()][move.j()] = 'X';
        }

    }


    private boolean isWinningMove(Move move) {
        char[][] clone = copy(board);
        clone[move.i()][move.j()] = 'X';
        return hasPlayerWon(clone, 'X');
    }

    private static char[][] copy(char[][] board) {
        char[][] clone = new char[board.length][];
        for (int i = 0; i < clone.length; i++) {
            clone[i] = board[i].clone();
        }
        return clone;
    }

    public void setInitialBoard(char[][] board) {
        this.board = board;
    }

    public boolean hasComputerWon() {
        return hasPlayerWon(board, 'X');
    }

    private boolean hasPlayerWon(char[][] board, char player) {
        for (char[] row : board) {
            if (row[0] == player && row[1] == player && row[2] == player) return true;
        }
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;
    }
}
