package org.usfirst.frc.team2813.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team2813.commands.Shoot;

public class OI {
	
	public static Joystick joystick;
	public static final int JOYSTICKID = 0;
	
	public OI() {
		joystick = new Joystick(JOYSTICKID);
		
		new JoystickButton(joystick, 1).whileHeld(new Shoot());
		
		
		
	}
	
}
