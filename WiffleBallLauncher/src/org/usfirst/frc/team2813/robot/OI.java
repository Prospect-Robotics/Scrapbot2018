package org.usfirst.frc.team2813.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
	
	public static Joystick joystick;
	public static final int JOYSTICKID = 0;
	public static final int numberOfYoinks = 10000;
	
	public OI() {
		joystick = new Joystick(JOYSTICKID);
	}
	
}
