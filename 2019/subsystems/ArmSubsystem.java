/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ArmForward;

/**
 * Add your docs here.
 */
//Subsystem for the arm solenoid
public class ArmSubsystem extends Subsystem {
  //Create arm solenoid
  DoubleSolenoid arm;
  
  //Assign arm solenoid
  public ArmSubsystem(){
    arm = RobotMap.arm;
  }

  //Method for moving the arm piston
  public void armset(Value x){
  arm.set(x);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  //Set the default value of the subsystem
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ArmForward());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
