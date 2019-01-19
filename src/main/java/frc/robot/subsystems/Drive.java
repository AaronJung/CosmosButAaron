package frc.robot.subsystems;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.robot.RobotMap;

public class Drive extends Subsystem {

    private final TalonSRX m_leftDriveMaster;
    private final TalonSRX m_leftDriveSlave1;
    private final TalonSRX m_leftDriveSlave2;

    private final TalonSRX m_rightDriveMaster;
    private final TalonSRX m_rightDriveSlave1;
    private final TalonSRX m_rightDriveSlave2;

    public Drive() {
        m_leftDriveMaster = new TalonSRX(RobotMap.leftDriveMasterID);
        m_leftDriveSlave1 = new TalonSRX(RobotMap.leftDriveSlave1ID);
        m_leftDriveSlave2 = new TalonSRX(RobotMap.leftDriveSlave2ID);

        m_rightDriveMaster = new TalonSRX(RobotMap.rightDriveMasterID);
        m_rightDriveSlave1 = new TalonSRX(RobotMap.rightDriveslave1ID);
        m_rightDriveSlave2 = new TalonSRX(RobotMap.rightDriveslave2ID);

        m_leftDriveSlave1.follow(m_leftDriveMaster);
    }

    public void setDrivePower (double percentLeft, double percentRight) {
        m_leftDriveMaster.set(ControlMode.PercentOutput, percentLeft);
        m_rightDriveMaster.set(ControlMode.PercentOutput, percentRight);
    }
    
    @Override
    protected void initDefaultCommand() {

    }
}