package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class LiftCommand extends Command {

    public LiftCommand(){
        super("LiftCommand");
        requires(Robot.lift);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    protected void execute(){
        
    }

}