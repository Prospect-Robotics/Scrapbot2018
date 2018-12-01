package org.usfirst.frc.team2813.subsystems.driveTrain;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;

public class CreateWPIEncoder {
	public static class Configuration {
    	public final double WHEEL_DIAMETER_INCHES = 3.95;
    	public final double WHEEL_CIRCUMFERENCE_INCHES = Math.PI * WHEEL_DIAMETER_INCHES;
    	public final double ENCODER_TO_DRIVE_SCALE = 3;
    	public final double ENCODER_PULSES_PER_ENCODER_REVOLUTION = 256;
    	public final double ENCODER_PULSES_PER_WHEEL_REVOLUTION = ENCODER_PULSES_PER_ENCODER_REVOLUTION * ENCODER_TO_DRIVE_SCALE;
    	public final double INCHES_PER_ENCODER_PULSE = WHEEL_CIRCUMFERENCE_INCHES / ENCODER_PULSES_PER_WHEEL_REVOLUTION;  
	}
	
	private static final Configuration kDefaultConfiguration = new Configuration();

	public static Encoder createEncoder(int encoderID, boolean reversed, Configuration config) {
		Encoder encoder= new Encoder(2*encoderID+10,2*encoderID+11, reversed, EncodingType.k4X);
		encoder.setDistancePerPulse(config.INCHES_PER_ENCODER_PULSE);
		encoder.setSamplesToAverage(0);
		encoder.setPIDSourceType(PIDSourceType.kRate);
		return encoder;
	}
	
	public static Encoder createDefaultEncoder(int encoderID, boolean reversed) {
		final Encoder encoder = createEncoder(encoderID, reversed, kDefaultConfiguration);
		return encoder;
	}
	
}
