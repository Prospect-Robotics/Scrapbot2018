/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2813;

import org.usfirst.frc.team2813.auto.AutoModeExecutor;
import org.usfirst.frc.team2813.auto.modes.CrossAutoLineMode;
import org.usfirst.frc.team2813.loops.Looper;

import java.util.Optional;

import org.usfirst.frc.team2813.auto.AutoModeBase;
import org.usfirst.frc.team2813.robot.OI;
import org.usfirst.frc.team2813.subsystems.Launcher;
import org.usfirst.frc.team2813.subsystems.driveTrain.DriveTrain;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends IterativeRobot {
	private Looper mEnabledLooper = new Looper();
    private Looper mDisabledLooper = new Looper();
	public static DriveTrain driveTrain;
	public static Launcher launcher;
	public static OI oi;

	private AutoFieldState mAutoFieldState = AutoFieldState.getInstance();
	private AutoModeSelector mAutoModeSelector = new AutoModeSelector();
	private AutoModeExecutor mAutoModeExecutor;
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		driveTrain = new DriveTrain();
		launcher = new Launcher();
		oi = new OI();
	}

	public void disabledInit() {
		mEnabledLooper.stop();
		if (mAutoModeExecutor != null) {
			mAutoModeExecutor.stop();
		}
		
		//Reset all auto mode state
		mAutoModeExecutor = new AutoModeExecutor();
		mDisabledLooper.start();
	}
	
	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString line to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional comparisons to
	 * the switch structure below with additional strings. If using the
	 * SendableChooser make sure to add them to the chooser code above as well.
	 */
	@Override
	public void autonomousInit() {
		mDisabledLooper.stop();

		mEnabledLooper.start();
		mAutoModeExecutor.start();
	}
	
	public void teleopInit() {
		mDisabledLooper.stop();
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
//		switch (m_autoSelected) {
//			case kCustomAuto:
//				// Put custom auto code here
//				break;
//			case kDefaultAuto:
//			default:
//				// Put default auto code here
//				break;
//		}
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
		AutoModeBase autoMode = mAutoModeSelector.getAutoMode(mAutoFieldState);
        System.out.println("DisabledPeriodic109");
        System.out.println("Set auto mode to: " + autoMode.getClass().toString());
        mAutoModeExecutor.setAutoMode(autoMode);
//		CrossAutoLineMode autoMode = new CrossAutoLineMode();//mAutoModeSelector.getAutoMode(mAutoFieldState);
	}
	
	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
		Scheduler.getInstance().run();
	}
}
