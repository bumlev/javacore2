package behaviorPattern.strategyPattern;

public class MediumLevel implements DifficultyLevelStrategy{

    @Override
    public void modifyGameRules() {
        // Modify game rules for medium level
        System.out.println("Game rules for medium level: Standard time limit and scoring.");
    }
}
