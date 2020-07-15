package be.jflanders.weight_impl._2Business.frameworks.level;

import lombok.Getter;

public class SquareRootProgression extends Progression {

    @Getter
    private double difficulty;

    public SquareRootProgression(double progression, double difficulty) {
        super(progression);
        this.difficulty = difficulty;
    }

    @Override
    public double getDifficulty() {
        return difficulty;
    }

    @Override
    public double getFormulaResult(double experience) {
        return Math.sqrt(experience);
    }

}
