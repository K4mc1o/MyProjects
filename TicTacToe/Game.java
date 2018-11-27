package ProgramowanieObiektowe.TicTacToe;

public class Game {
    private Board board;
    private Player player;
    private boolean isPlaying;

    Game(){
        board = new Board();
        player = new Player();
        isPlaying = true;
    }

    void start(){
        while(isPlaying){
            board.drawBoard();
            player.showPlayer();
            player.movePlayerRow();
            player.movePlayerColumn();
            if(!board.isAvailable(player)){
                continue;
            }
            player.takePosition(board);
            if (player.isWinner(board)){
                isPlaying=false;
                System.out.println("Wygrywa gracz: " + player.currentPlayer);
            }
            player.changePlayer();
        }
    }
}
