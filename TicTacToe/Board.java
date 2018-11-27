package ProgramowanieObiektowe.TicTacToe;

public class Board {
    public static final int BOARD_SIZE = 3;
    char[][] board;

    Board(){
        this.board = new char[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i<this.board.length; i++){
            for (int j = 0; j<this.board[i].length;j++){
                this.board[i][j] = '-';
            }
        }
    }
    void drawBoard(){
        for(char[] row : this.board){
            for(char el : row){
                System.out.print("[" + el + "]");
            }
            System.out.println();
        }
    }
    boolean isAvailable(Player player){
        if(this.board[player.row-1][player.column-1] == '-'){
            return true;
        }else{
            System.out.println("Sorry.. pole jest zajete");
            return false;
        }
    }

}
