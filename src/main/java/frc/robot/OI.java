package frc.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import frc.robot.commands.teleop.LiftArm;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drive;

public class OI {
  public static Arm arm = new Arm();
  public static Drive drive = new Drive();

  public Joystick driveJoyLeft = new Joystick(0);
  public Joystick driveJoyRight = new Joystick(1);

  public Button btnArm = new JoystickButton(driveJoyRight, 1);

  public OI(){
    btnArm.toggleWhenPressed(new LiftArm());

    //arm = new JoystickButton(driveJoyLeft, 1);
  }
  
  public double getDriveJoyLeftX(){
    return driveJoyLeft.getX();
  }
  public double getDriveJoyLeftY(){
    return driveJoyLeft.getY();
  }
  public double getDriveJoyRightX(){
    return driveJoyRight.getX();
  }
  public double getDriveJoyRightY(){
    return driveJoyRight.getY();
  }
}
// time flies like an arrow and a fruit flies like a banana

// you honesly shouldn't be copying from me