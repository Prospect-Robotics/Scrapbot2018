package org.usfirst.frc.team2813.commands;

public class Shoot extends Command {
	
	public shoot() {
		requires(Robot.Launcher);
	}
	protected void execute() {
		Launcher.init();
	}
	
	protected boolean isFinished() {
		return false;
		
	}
}
