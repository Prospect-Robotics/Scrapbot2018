package org.usfirst.frc.team2813.subsystems.driveTrain;

public class driveTrainEncoder {
    public static final double WHEEL_DIAMETER_INCHES = 3.95;
    public static final double WHEEL_CIRCUMFERENCE_INCHES = Math.PI * WHEEL_DIAMETER_INCHES;
    public static final double ENCODER_TO_DRIVE_SCALE = 3;
    public static final double ENCODER_PULSES_PER_ENCODER_REVOLUTION = 256;
    public static final double ENCODER_PULSES_PER_WHEEL_REVOLUTION = ENCODER_PULSES_PER_ENCODER_REVOLUTION * ENCODER_TO_DRIVE_SCALE;
    public static final double INCHES_PER_ENCODER_PULSE = WHEEL_CIRCUMFERENCE_INCHES / ENCODER_PULSES_PER_WHEEL_REVOLUTION;

}
