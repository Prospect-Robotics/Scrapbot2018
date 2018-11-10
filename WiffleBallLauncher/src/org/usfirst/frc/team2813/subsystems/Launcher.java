package org.usfirst.frc.team2813.subsystems;

import org.usfirst.frc.team2813.commands.Shoot;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Launcher extends Subsystem {
	
	private final int LAUNCHER_MOTOR_ID = 3;

	private final WPI_VictorSPX launcherMotor = new WPI_VictorSPX(LAUNCHER_MOTOR_ID);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Shoot());
    }
}

