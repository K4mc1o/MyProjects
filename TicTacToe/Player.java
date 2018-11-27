package TicTacToe;

import java.util.Scanner;

public class Player {
    char currentPlayer;
    int row;
    int column;

    Player(){
        currentPlayer = 'O';
    }

    void showPlayer(){
        System.out.println("Teraz gracz: " + currentPlayer);
    }

    char changePlayer(){
        if(currentPlayer == 'X'){
            this.currentPlayer = 'O';
        }else{
            this.currentPlayer = 'X';
        }
        return this.currentPlayer;
    }
    void movePlayerRow(){
        System.out.println("Podaj numer wiersza: ");
        this.row = new Scanner(System.in).nextInt();
    }
    void movePlayerColumn(){
        System.out.println("Podaj numer kolumny: ");
        this.column = new Scanner(System.in).nextInt();
    }
    void takePosition(Board board) {
        board.board[row - 1][column - 1] = this.currentPlayer;
    }

    boolean isWinner(Board board){
        for (int i = 0; i < board.board.length; i++) {
            int sumaWiersze = 0;
            for (int j = 0; j < board.board[i].length; j++) {
                if (board.board[i][j] == currentPlayer) {
                    sumaWiersze++;}

                if (sumaWiersze == board.board[i].length) {
                    return true;
                }
            }
        }
        //sprawdzenie kolumn
        for (int i = 0; i < board.board.length; i++) {
            int sumaKolumny = 0;
            for (int j = 0; j < board.board[i].length; j++) {
                if (board.board[j][i] == currentPlayer) {
                    sumaKolumny++;}
                if (sumaKolumny == board.board[i].length) {
                    return true;
                }
            }
        }
        //sprawdzenie diagonalnych
        for (int i = 0; i < board.board.length; i++) {
            int sumaPrzekatne = 0;
            int sumaPrzekatne2 = 0;
            for (int j = 0; j < board.board[i].length; j++) {
                if (board.board[j][j] == currentPlayer) {
                    sumaPrzekatne++;
                }
                if (board.board[board.board[i].length-1 - j][j]==currentPlayer){
                    sumaPrzekatne2++;}

                if (sumaPrzekatne == board.board[i].length || sumaPrzekatne2 == board.board[i].length) {
                    return true;
                }
            }
        }
        return false;
    }
}
