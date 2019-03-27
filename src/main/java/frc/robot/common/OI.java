package frc.robot.common;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI{
    XboxController driverController;
  
    private static final int driveControllerPort = 0;
    
    public OI(){
        driverController = new XboxController(driveControllerPort);
    }

    public double getRightYAxis(){
        return driverController.getY(Hand.kRight);
    }
    public double getLeftYAxis(){
        return driverController.getY(Hand.kLeft);
    }
    public double getRTrigger(){
        return driverController.getTriggerAxis(Hand.kRight);
    }
    public double getLTrigger(){
        return driverController.getTriggerAxis(Hand.kLeft);
    }

    public void updateDashboard(){
        SmartDashboard.putNumber("Right Input", this.getRightYAxis());
        SmartDashboard.putNumber("Left Input", this.getLeftYAxis());
    }
}

