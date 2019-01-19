/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {

  public Joystick driveJoyLeft = new Joystick(0);
  public Joystick driveJoyRight = new Joystick(1);

  public JoystickButton arm;

  public OI(){
    arm = new JoystickButton(driveJoyLeft, 1);
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
