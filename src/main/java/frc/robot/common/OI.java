package frc.robot.common;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI{
    Joystick driverController;
  
    private static final int driveControllerPort = 0;
    
    public OI(){
        driverController = new Joystick(driveControllerPort);
    }

    public double getRightYAxis(){
        return driverController.getY(Hand.kRight);
    }
    public double getLeftYAxis(){
        return driverController.getY(Hand.kLeft);
    }
    //public double rTrigger(){
       // return driverController.get(Hand.kRight);
    //}

    public void updateDashboard(){
        SmartDashboard.putNumber("Right Input", this.getRightYAxis());
        SmartDashboard.putNumber("Left Input", this.getLeftYAxis());
    }
}

