package behaviorPattern.strategyPattern;

import behaviorPattern.strategyPattern.context.Game;

public class PuzzleGame {

    public static void main(String[] args) {
        Game game = new Game(new EasyLevel());

        game.startGame();  // Start game with easy difficulty

        game.setDifficultyLevel(new MediumLevel());
        game.startGame();  // Switch to medium difficulty

        game.setDifficultyLevel(new HardLevel());
        game.startGame();  // Play on hard difficulty
    }
}
