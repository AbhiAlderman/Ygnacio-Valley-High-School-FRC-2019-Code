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

/**
 * Add your docs here.
 */
//Subsystem for the Ramp Solenoids
public class RampChange extends Subsystem {
  //Create ramp solenoid
  Solenoid ramp;
  
  //Assign the ramp
  public RampChange(){
    ramp = RobotMap.ramp;
  }

  //Method to control the ramp
  public void rampset(boolean x){
    ramp.set(x);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  //Set the default command
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
