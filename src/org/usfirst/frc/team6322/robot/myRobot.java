package org.usfirst.frc.team6322.robot;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;

public class myRobot extends IterativeRobot {
	RobotDrive myRobot = new RobotDrive(0, 7);
	Joystick stick = new Joystick(0);
	Timer timer = new Timer();
	
	@Override
	public void robotInit() {
	}

	@Override
	public void autonomousInit() {
		// Normal Drive (forward/backward)  -> drive(time, speed)
		// Tank Drive						-> drive(time, left, right)
		// Pause (no movement for x time)   -> drive(true, time)
		drive("pause", 1);
		drive(1, 0.75);
		drive("pause", 1);
		drive(1, -0.75);
		drive("pause", 1);
	}
	
	private void drive(String task, double time) {
		switch (task) {
		case "pause":
			drive(0, time);
			break;
		}
	}
	private void drive(double time, double speed) {
		move(speed);
		sleep(time);
	}
	@SuppressWarnings("unused")
	private void drive(double time, double leftSpeed, double rightSpeed) {
		move(leftSpeed, rightSpeed);
		sleep(time);
	}
	private void move(double speed) {
		myRobot.tankDrive(speed, speed);
	}
	private void move(double leftSpeed, double rightSpeed) {
		myRobot.tankDrive(leftSpeed, rightSpeed);
	}
	private void sleep(double time) {		
		// Take the given input and multiply it by 1000 to convert to milliseconds
		// i.e.		0.5 seconds -> 0.5s * 1000 -> 500 milliseconds
		long newTime = (long) (time * 1000);
		try {
			Thread.sleep(newTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void autonomousPeriodic() {
		move(0);
	}
	@Override
	public void teleopPeriodic() {
	}
	@Override
	public void testPeriodic() {
	}
}

