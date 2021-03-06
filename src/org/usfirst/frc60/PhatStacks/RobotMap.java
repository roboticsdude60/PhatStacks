// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc60.PhatStacks;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeftFront;
    public static SpeedController driveTrainLeftBack;
    public static SpeedController driveTrainRightFront;
    public static SpeedController driveTrainRightBack;
    public static RobotDrive driveTrainRobotDrive4;
    public static Solenoid lowerArmslowerArms;
    public static DoubleSolenoid upperArmsupperArmsDoubleSolenoid;
    public static Solenoid tilterTilterSolenoids;
    public static SpeedController liftSpeedController1;
    public static SpeedController liftSpeedController2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftFront = new Talon(7);
        LiveWindow.addActuator("DriveTrain", "LeftFront", (Talon) driveTrainLeftFront);
        
        driveTrainLeftBack = new Talon(8);
        LiveWindow.addActuator("DriveTrain", "LeftBack", (Talon) driveTrainLeftBack);
        
        driveTrainRightFront = new Talon(2);
        LiveWindow.addActuator("DriveTrain", "RightFront", (Talon) driveTrainRightFront);
        
        driveTrainRightBack = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "RightBack", (Talon) driveTrainRightBack);
        
        driveTrainRobotDrive4 = new RobotDrive(driveTrainLeftFront, driveTrainLeftBack,
              driveTrainRightFront, driveTrainRightBack);
        
        driveTrainRobotDrive4.setSafetyEnabled(true);
        driveTrainRobotDrive4.setExpiration(0.1);
        driveTrainRobotDrive4.setSensitivity(0.5);
        driveTrainRobotDrive4.setMaxOutput(1.0);

        driveTrainRobotDrive4.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveTrainRobotDrive4.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        lowerArmslowerArms = new Solenoid(0, 1);
        LiveWindow.addActuator("LowerArms", "lowerArms", lowerArmslowerArms);
        
        upperArmsupperArmsDoubleSolenoid = new DoubleSolenoid(0, 2, 4);
        LiveWindow.addActuator("UpperArms", "upperArmsDoubleSolenoid", upperArmsupperArmsDoubleSolenoid);
        
        tilterTilterSolenoids = new Solenoid(0, 3);
        LiveWindow.addActuator("Tilter", "TilterSolenoids", tilterTilterSolenoids);
        
        liftSpeedController1 = new Talon(0);
        LiveWindow.addActuator("Lift", "Speed Controller 1", (Talon) liftSpeedController1);
        
        liftSpeedController2 = new Talon(9);
        LiveWindow.addActuator("Lift", "Speed Controller 2", (Talon) liftSpeedController2);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
