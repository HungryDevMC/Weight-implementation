package be.jflanders.weight_impl._2Business.frameworks.level;

import lombok.Getter;

public abstract class Progression implements IProgression {

    @Getter
    private double progression;

    public Progression(double progression) {
        this.progression = progression;
    }

    /**
     * Get level for amount of progression
     * @return current level
     */
    public int getCurrentLevel(){
        return (int)(getDifficulty() * getFormulaResult(progression));
    }

    /**
     *
     * @param level level you want to get the total amount of progression from
     * @return returns the total progression for a specific level, total progression from 0 - param level
     */
    public double getTotalExperienceOfLevel(int level){
        return Math.pow(level / getDifficulty(), 2);
    }

    /**
     *
     * @return amount of progression from progression needed for next level - current progression
     */
    public double getExperienceNeededForNextLevel(){
        return getTotalExperienceOfLevel(getCurrentLevel() + 1) - progression;
    }

    /**
     *
     * @return Total progression between 2 levels
     */
    private double getExperienceBetweenLevels(){
        return getTotalExperienceOfLevel(getCurrentLevel() + 1) - getTotalExperienceOfLevel(getCurrentLevel());
    }

    /**
     *
     * @return the progress in double format for next level
     */
    public double getProgressForNextLevel(){
        return (progression - getTotalExperienceOfLevel(getCurrentLevel())) / getExperienceBetweenLevels();
    }

}
