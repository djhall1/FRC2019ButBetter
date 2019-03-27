package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArmCommand extends Command {

    public ArmCommand(){
        super("ArmCommand");
        requires(Robot.arm);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    protected void execute(){
        double input = Robot.oi.getRTrigger();
        Robot.arm.setArm(input);
    }

}