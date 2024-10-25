package behaviorPattern.strategyPattern.context;

import behaviorPattern.strategyPattern.DifficultyLevelStrategy;

public class Game {

    private DifficultyLevelStrategy difficultyLevelStrategy;

    public Game(DifficultyLevelStrategy difficultyLevelStrategy) {
        this.difficultyLevelStrategy = difficultyLevelStrategy;
    }

    public void setDifficultyLevel(DifficultyLevelStrategy difficultyLevelStrategy) {
        this.difficultyLevelStrategy = difficultyLevelStrategy;
    }

    public void startGame() {
        difficultyLevelStrategy.modifyGameRules();
        // Other game logic
    }
}
