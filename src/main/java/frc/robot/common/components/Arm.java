package frc.robot.common.components;



import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {

    @Override
    protected void initDefaultCommand() {

    }

    private final int ARM_MOTOR_PORT = 4;

    private final int UP_LIMIT_PORT = 0;
    private final int DOWN_LIMIT_PORT = 1;

    private Victor armMotor;
    private DigitalInput downLimit, upLimit;

    public Arm(){
        this.armMotor = new Victor(ARM_MOTOR_PORT);
        this.downLimit = new DigitalInput(DOWN_LIMIT_PORT);
        this.upLimit = new DigitalInput(UP_LIMIT_PORT);
  
    }

    public void setArm(double inputSpeed){
        if(inputSpeed > 0 && getUpLimit()){
            this.armMotor.set(0);
        } else if(inputSpeed < 0 && getDownLimit()){
            this.armMotor.set(0);
        } else{
            this.armMotor.set(inputSpeed);
        }
        
    }
    public boolean getDownLimit() {
        return downLimit.get();
    }
    public boolean getUpLimit(){
        return upLimit.get();
    }

    public void updateDashboard(){

    }
}