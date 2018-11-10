package org.usfirst.frc.team2813.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
	
	public static Joystick joystick;
	public static final int JOYSTICKID = 0;
	
	public OI() {
		joystick = new Joystick(JOYSTICKID);
	}
	
}
