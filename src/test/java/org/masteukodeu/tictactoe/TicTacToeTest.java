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
    public void shouldMakeAMove() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.computerMove();

        assertArrayEquals(new char[][] {
                {'X',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '},
        }, ticTacToe.getCurrentBoard());
    }

    @Test
    public void shouldMakeAMove2() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.setInitialBoard(new char[][] {
                {'X','O','X'},
                {'O','X','O'},
                {'O',' ',' '},
        });

        ticTacToe.computerMove();

        assertArrayEquals(new char[][] {
                {'X','O','X'},
                {'O','X','O'},
                {'O','X',' '},
        }, ticTacToe.getCurrentBoard());
    }

}