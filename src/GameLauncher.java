public class GameLauncher {
    public static void main (String[] args) {
        GuessGame game = new GuessGame();

        try {
            Integer x = 2;
            System.out.println("aaa=" + x.bitCount(3));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //game.startGame();
    }
}
