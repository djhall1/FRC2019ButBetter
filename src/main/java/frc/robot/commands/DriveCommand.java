package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveCommand extends Command {

    public DriveCommand(){
        super("DriveCommand");
        requires(Robot.drive);
    }
    @Override
    protected boolean isFinished() {
        return false;
    }

    protected void execute(){
        double leftInput = Robot.oi.getLeftYAxis();
        double rightInput = Robot.oi.getRightYAxis();
        Robot.drive.setTankDrive(leftInput, rightInput);
    }

}