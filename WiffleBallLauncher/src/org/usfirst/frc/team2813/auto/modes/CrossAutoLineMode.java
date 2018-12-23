package org.usfirst.frc.team2813.auto.modes;

import org.usfirst.frc.team2813.auto.AutoModeBase;
import org.usfirst.frc.team2813.auto.actions.Move;
import org.usfirst.frc.team2813.auto.actions.WaitAction;

public class CrossAutoLineMode extends AutoModeBase {

    @Override
    protected void routine() {
        System.out.println("Running Cross auto line");
        runAction(new WaitAction(5.0));
        runAction(new Move(true, 60, 1.0));
    }
}
