package TicTacToe;

public class PlayerMain {
    public static void main(String[] args) {
        Player player = new Player();
        player.showPlayer();
        player.changePlayer();
        player.showPlayer();

        player.movePlayerRow();
        System.out.println();
        player.movePlayerColumn();
        System.out.println();

    }
}
