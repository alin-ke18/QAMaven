public class GameManager {

    private Game game;

    public GameManager(Game game) {
    this.game = game;
    }

    public int countRounds(int[] onePlayersSpeeds) {

        int rounds = 0;
        int i = 0;
        for (int speed : onePlayersSpeeds) {
            if (!game.isFailed(onePlayersSpeeds[i])) {
                rounds++;
            }
            i++;
        }
        System.out.println(rounds);
        return rounds;
    }
}
