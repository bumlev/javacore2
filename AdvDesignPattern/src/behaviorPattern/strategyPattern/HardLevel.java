package behaviorPattern.strategyPattern;

public class HardLevel implements DifficultyLevelStrategy{

    @Override
    public void modifyGameRules() {
        // Modify game rules for hard level
        System.out.println("Game rules for hard level: Time limit reduced, complex scoring.");
    }
}
