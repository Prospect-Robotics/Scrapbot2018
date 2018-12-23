package org.usfirst.frc.team2813.auto.creators;

import org.usfirst.frc.team2813.AutoFieldState;
import org.usfirst.frc.team2813.auto.AutoModeBase;
import org.usfirst.frc.team2813.auto.modes.CrossAutoLineMode;

public class CrossAutoLineCreator implements AutoModeCreator {

    // Pre-build trajectories to go left and right
    private static CrossAutoLineMode mCrossAutoLineMode = new CrossAutoLineMode();

    public AutoModeBase getStateDependentAutoMode(AutoFieldState fieldState) {
        return mCrossAutoLineMode;
    }
}
