package frc.team2412.robot;

import frc.team2412.robot.Subsystems.DriveBaseSubsystem;
import frc.team2412.robot.Subsystems.ExampleSubsystem;
import frc.team2412.robot.Subsystems.FlywheelSubsystem;
import frc.team2412.robot.Subsystems.HoodSubsystem;
import frc.team2412.robot.Subsystems.LimelightSubsystem;
import frc.team2412.robot.Subsystems.TurretSubsystem;
import frc.team2412.robot.Subsystems.LiftSubsystem;

// this is the class for containing all the subsystems and OI of the robot
public class RobotContainer {
	// Subsystems
	public ExampleSubsystem m_ExampleSubsystem;
	public LimelightSubsystem m_LimelightSubsystem;
	public TurretSubsystem m_TurretSubsystem;
	public FlywheelSubsystem m_FlywheelSubsystem;
	public HoodSubsystem m_HoodSubsystem;

	public LiftSubsystem liftSubsystem;

	public DriveBaseSubsystem driveBaseSubsystem;

	public RobotContainer() {
		// create and instance of example subsystem with the id from robot map
		m_ExampleSubsystem = new ExampleSubsystem(RobotMap.exampleID);

		m_LimelightSubsystem = new LimelightSubsystem(RobotMap.limelight);

		m_TurretSubsystem = new TurretSubsystem(RobotMap.turretMotor, m_LimelightSubsystem);

		m_FlywheelSubsystem = new FlywheelSubsystem(RobotMap.flywheelMotor1, RobotMap.flywheelMotor2);

		m_HoodSubsystem = new HoodSubsystem(RobotMap.hoodServo);

    liftSubsystem = new LiftSubsystem(RobotMap.liftUpDown);

		driveBaseSubsystem = new DriveBaseSubsystem(RobotMap.robotDrive, RobotMap.gyro);
	}
}
