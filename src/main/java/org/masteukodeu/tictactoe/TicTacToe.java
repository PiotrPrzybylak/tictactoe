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
        board = new char[][]{
                {'X', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
    }
}
