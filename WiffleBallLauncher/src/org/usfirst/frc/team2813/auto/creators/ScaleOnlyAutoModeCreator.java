package org.usfirst.frc.team2813.auto.creators;

import org.usfirst.frc.team2813.AutoFieldState;
import org.usfirst.frc.team2813.auto.AutoModeBase;
import org.usfirst.frc.team2813.auto.modes.FarScaleOnlyMode;
import org.usfirst.frc.team2813.auto.modes.NearScaleOnlyMode;

public class ScaleOnlyAutoModeCreator implements AutoModeCreator {

    private final AutoModeBase hardScaleMode;
    private final AutoModeBase easyScaleMode;
    private boolean mRobotStartedOnLeft;

    public ScaleOnlyAutoModeCreator(boolean robotStartedOnLeft) {
        mRobotStartedOnLeft = robotStartedOnLeft;
        hardScaleMode = new FarScaleOnlyMode();
        easyScaleMode = new NearScaleOnlyMode();
    }

    @Override
    public AutoModeBase getStateDependentAutoMode(AutoFieldState fieldState) {
        System.out.print("Getting ScaleOnlyAutoMode for " + mRobotStartedOnLeft + " / " + fieldState.toString());
        if ((mRobotStartedOnLeft && fieldState.getScaleSide() == AutoFieldState.Side.LEFT) ||
                (!mRobotStartedOnLeft && fieldState.getScaleSide() == AutoFieldState.Side.RIGHT)) {
            return easyScaleMode;
        } else {
            return hardScaleMode;
        }
    }
}
