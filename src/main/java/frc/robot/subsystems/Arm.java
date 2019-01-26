package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Timer;

import frc.robot.RobotMap;

public class Arm extends Subsystem {

    private final TalonSRX m_arm;

    public Arm() {
        m_arm = new TalonSRX(RobotMap.armID);

// once upon a midnight dreavy over many a quaint and curious volume of the forgotten lore while i nodded nearly napping suddenly there came a tapping as if someone gently rapping rapping at my chamber door tis some visitors i muttered tapping at my chamber door. ah disincly i remeber it was in the bleak december. and each seperate amber rot itself upon the floor. egerly i wished the morrow vainly i sought to borrow from the book serceace of sorrow sorrow for the lost lenor
    }

    public double voltageLimit = .5;
    public double armPercent = .5;

    // rock rock rock rock
    // rock
    // rock
    // rock rock rock rock              Mountain
    // rock
    // rock
    // rock
    // rock rock rock rock
     
    // that's a rock-e mountain

    public void liftUp(){
        int neg;
        int target = 90;

        chooseUpOrDown();

        int error = (int) (target - getArmPosition());
        while(error <= 0 && getArmVoltage() <= voltageLimit){
            // uod stands for "up or down" cuz like up starts with u and or starts with u and down starts with d that makes uod
            if(uod == 0){
                neg = -1;
            }
            else{
                neg = 1;
            }
                m_arm.set(ControlMode.PercentOutput, (neg * armPercent));
        }
        m_arm.set(ControlMode.PercentOutput, 0);
    }

    // what does a programmer use to get around on snow?
    // keyboard

    public void reportToSmartdashboard(){
        SmartDashboard.putNumber("arm position", getArmPosition());
        SmartDashboard.putNumber("arm velocity", getArmVelocity());
        SmartDashboard.putNumber("arm current", getArmCurrent());
        SmartDashboard.putNumber("arm Voltage", getArmVoltage());
    }

    // what do you call a sad strawberry
    // berry depressed
    public double getArmPosition(){
        return m_arm.getSelectedSensorPosition();
    }
    public double getArmVelocity(){
        return m_arm.getSelectedSensorVelocity();
    }
    public double getArmVoltage(){
        return m_arm.getMotorOutputVoltage();
    }
    public double getArmCurrent(){
        return m_arm.getOutputCurrent();
    }


    int upOrDown = 0;
    public double upOrDown(){
        if(upOrDown == 0){
            upOrDown = 1;
        }
        else if(upOrDown == 1){
            upOrDown = 0;
        }
        return upOrDown;
    }

    int uod = 0;
    public void chooseUpOrDown(){
        boolean m_good = false;
        if(m_good == false){
            if(uod == 0){
                uod = 1;
                m_good = true;
            }
            else if(uod == 1){
                uod  = 0;
                m_good = true;
            }
        }
    }

    @Override
    protected void initDefaultCommand() {
    }

    // what do you call a group of bats fighting
// com-bat

}
// you honesly shouldn't be copying from me