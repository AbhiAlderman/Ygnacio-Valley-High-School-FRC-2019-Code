/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.IntakePistonOpen;

/**
 * Add your docs here.
 */
//Subsystem for Intake solenoids
public class IntakePneumaticSub extends Subsystem {
  //Create the intakepiston solenoid
  Solenoid intakepiston;
  
  //Assign the intakepiston
  public IntakePneumaticSub(){
    intakepiston = RobotMap.intakepiston;
  }
  
  //Method to control the intakepiston
  public void intakepistonset(boolean x){
    intakepiston.set(x);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  //Set the default command
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new IntakePistonOpen());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
