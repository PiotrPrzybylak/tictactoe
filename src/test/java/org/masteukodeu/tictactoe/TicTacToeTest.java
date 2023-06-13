package org.masteukodeu.tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {


    @Test
    public void emptyBoard() {
        TicTacToe ticTacToe = new TicTacToe();


        assertArrayEquals(new char[][] {
                {' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '},
        }, ticTacToe.getCurrentBoard());
    }

    @Test
    public void should() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.computerMove();

        assertArrayEquals(new char[][] {
                {'X',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '},
        }, ticTacToe.getCurrentBoard());
    }

}