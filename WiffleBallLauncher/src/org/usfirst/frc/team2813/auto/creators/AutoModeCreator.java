package org.usfirst.frc.team2813.auto.creators;

import org.usfirst.frc.team2813.AutoFieldState;
import org.usfirst.frc.team2813.auto.AutoModeBase;

public interface AutoModeCreator {
    AutoModeBase getStateDependentAutoMode(AutoFieldState fieldState);
}
