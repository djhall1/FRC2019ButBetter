package frc.robot.common.components;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.LiftCommand;

public class Lift extends Subsystem {

    private int LIFT_MOTOR_PORT = 1;

    private Victor liftMotor;

    public Lift(){
        this.liftMotor = new Victor(LIFT_MOTOR_PORT);
        this.liftMotor.set(0); // Initial Speed to 0
    }

    public void setLiftSpeed(double input){
        this.liftMotor.set(input);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new LiftCommand());
    }



}