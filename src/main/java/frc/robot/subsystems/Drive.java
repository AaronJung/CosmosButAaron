package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
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
// once upon a midnight dreavy over many a quaint and curious volume of the forgotten lore while i nodded nearly napping suddenly there came a tapping as if someone gently rapping rapping at my chamber door tis some visitors i muttered tapping at my chamber door. ah disincly i remeber it was in the bleak december. and each seperate amber rot itself upon the floor. egerly i wished the morrow vainly i sought to borrow from the book serceace of sorrow sorrow for the lost lenor
        m_leftDriveSlave1.follow(m_leftDriveMaster);
        m_leftDriveSlave2.follow(m_leftDriveMaster);
        
        m_rightDriveSlave1.follow(m_rightDriveMaster);
        m_rightDriveSlave2.follow(m_rightDriveMaster);
    }

    public double percentLeft;
    public double percentRight;

    public void setDrivePower (double percentLeft, double percentRight) {
        m_leftDriveMaster.set(ControlMode.PercentOutput, percentLeft);
        m_rightDriveMaster.set(ControlMode.PercentOutput, percentRight);
    }

    @Override
    protected void initDefaultCommand() {
    }
}
