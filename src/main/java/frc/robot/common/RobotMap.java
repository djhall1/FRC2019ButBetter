import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;

public class RobotMap {

   

    RobotMap(){
        
    }

    public SpeedControllerGroup getRightDrive(){
        return this.rightDrive;    
    }
    public SpeedControllerGroup getLeftDrive(){
        return this.leftDrive;
    }
}s