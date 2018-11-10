package org.usfirst.frc.team2813.subsystems;

import org.usfirst.frc.team2813.commands.Shoot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Launcher extends Subsystem {
	
	private final static int LAUNCHER_MOTOR_ID = 3;

	private final static VictorSPX launcherMotor = new VictorSPX(LAUNCHER_MOTOR_ID);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Shoot());
    }
    
    public static void init() {
    	launcherMotor.set(1);
    }
}

