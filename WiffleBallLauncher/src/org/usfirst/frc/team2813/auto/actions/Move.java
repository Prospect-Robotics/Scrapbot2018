package org.usfirst.frc.team2813.auto.actions;

import org.usfirst.frc.team2813.robot.Robot;

public class Move implements Action {

	private static boolean forward;
	private static double inches;
	private static double inchesTraveled;
	private static double maxSpeed;
	
	public Move(boolean forward, double inches, double maxSpeed) {
		this.forward = forward;
		this.inches = inches;
		this.maxSpeed = maxSpeed;
	}
	
	
	@Override
	public boolean isFinished() {	
		return inchesTraveled >= inches;
	}

	@Override
	public void update() {
		Robot.driveTrain.arcadeDrive(maxSpeed);
	}

	@Override
	public void done() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	

	}


