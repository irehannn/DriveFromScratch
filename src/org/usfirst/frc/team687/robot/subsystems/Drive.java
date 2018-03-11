package org.usfirst.frc.team687.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**

 */
public class Drive extends Subsystem {
	VictorSP frcPractice;
	VictorSP frcPractice1;
	VictorSP frcPractice2;
	VictorSP frcPractice3;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
public Drive() {
	frcPractice = new VictorSP(0);
	frcPractice1 = new VictorSP(1);
	frcPractice2 = new VictorSP(2);
	frcPractice3 = new VictorSP(3);
}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void tankDrive (double leftPower, double rightPower) {
    		frcPractice.set(leftPower);
    		frcPractice1.set(rightPower);
    		frcPractice2.set(leftPower);
    		frcPractice3.set(rightPower);
    }	
}

