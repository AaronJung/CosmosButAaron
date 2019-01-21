package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.teleop.TankDrive;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drive;

// import com.ctre.CANTalon;
// import com.ctre.CANTalon.FeedbackDevice;
// import com.ctre.CANTalon.TalonControlMode;

public class Robot extends TimedRobot {
  public static Arm arm = new Arm();
  public static Drive drive = new Drive();
  public static OI m_oi;

  public int upOrDown = 0;

  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  @Override
  public void robotInit() {
    m_oi = new OI();
    // m_chooser.setDefaultOption("Default Auto", new ExampleCommand());
    // chooser.addOption("My Auto", new MyAutoCommand());
    SmartDashboard.putData("Auto mode", m_chooser);
  }

  @Override
  public void robotPeriodic() {
    arm.reportToSmartdashboard();
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_chooser.getSelected();

    if (m_autonomousCommand != null) {
      m_autonomousCommand.start();
    }
  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }


  // 60 Degrees

  //dog dog dog dog dog
  //dog
  //dog
  //dog
  //dog dog dog dog dog
  //dog
  //dog
  //dog dog dog dog dog

  // that's acut dog-e

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();

    double percentLeft = Robot.m_oi.getDriveJoyLeftY();
    double percentRight = Robot.m_oi.getDriveJoyRightY();

    drive.setDrivePower(-percentLeft, -percentRight);
  }

  @Override
  public void testPeriodic() {
  }
}
// you honesly shouldn't be copying from me