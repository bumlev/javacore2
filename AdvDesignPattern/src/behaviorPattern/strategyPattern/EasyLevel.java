package behaviorPattern.strategyPattern;

public class EasyLevel implements DifficultyLevelStrategy {

    @Override
    public void modifyGameRules() {
        // Modify game rules for easy level
        System.out.println("Game rules for easy level: Time limit increased, scoring simplified.");
    }
}
