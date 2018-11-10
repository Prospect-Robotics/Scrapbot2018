package org.usfirst.frc.team2813.subsystems;

import org.usfirst.frc.team2813.commands.OIDrive;
import org.usfirst.frc.team2813.robot.CreateTalonSRX;


import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private final int LEFTTALONID = 1;
	private final int LEFTVICTORID = 2;
	private final int RIGHTTALONID = 7;
	private final int RIGHTVICTORID = 8;
	private final WPI_TalonSRX driveTrainLeft = CreateTalonSRX.createDefaultWPITalonVictorSlave(LEFTTALONID, LEFTVICTORID);
	private final WPI_TalonSRX driveTrainRight = CreateTalonSRX.createDefaultWPITalonVictorSlave(RIGHTTALONID, RIGHTVICTORID);
	
	private final DifferentialDrive robotDrive = new DifferentialDrive(driveTrainLeft, driveTrainRight);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new OIDrive());        
    }
    
    public void arcadeDrive(Joystick joystick) {
    	
    	robotDrive.arcadeDrive(joystick.getY(), -joystick.getX());
    }
}

