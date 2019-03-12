import edu.wpi.first.wpilibj.Joystick;

public class OI{
    Joystick driverController;
    private static final int driveControllerPort = 0;
    
    private OI(){
        driverController = new Joystick(driveControllerPort);
    }
    
}

