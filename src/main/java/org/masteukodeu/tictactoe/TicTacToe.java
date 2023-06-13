package org.masteukodeu.tictactoe;

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
        for (int i = 0; i < board.length; i++) {
            char[] row = board[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] == ' ') {
                    row[j] = 'X';
                    return;
                }
            }
        }
    }

    public void setInitialBoard(char[][] board) {
        this.board = board;
    }
}
