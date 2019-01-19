/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.teleop;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TankDrive extends Command {
  public TankDrive() {
    requires(Robot.drive);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    // double leftPow = Robot.m_oi.getDriveJoyLeftY();
    // double rightPow = Robot.m_oi.getDriveJoyRightY();
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}
