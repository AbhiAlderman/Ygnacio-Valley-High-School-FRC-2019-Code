/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ArmMotorCommand;

/**
 * Add your docs here.
 */

//Subsytem for the arm motor
public class ArmMotorSubsystem extends Subsystem {
  //Create the arm motor
  WPI_TalonSRX armmotor;
  
  public ArmMotorSubsystem(){
    //Assign the arm motor 
    armmotor = RobotMap.armMotor;
  }
  
  //Method for setting the speed of the arm motor
  public void armmotorset(double x){
    armmotor.set(ControlMode.PercentOutput, x);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  //Set the default command
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ArmMotorCommand());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
