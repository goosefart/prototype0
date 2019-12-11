/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Goose extends Subsystem {
 VictorSPX frontleftdrive;
 VictorSPX frontrightdrive;
 VictorSPX backleftdrive;
 VictorSPX backrightdrive;
 public Goose(){
   frontleftdrive =new VictorSPX(0);
   frontrightdrive =new VictorSPX(1);
   backleftdrive =new VictorSPX(2);
   backrightdrive =new VictorSPX(3);

 }
 public void drive (double leftjoy,double rightjoy){
   frontleftdrive.set(ControlMode.PercentOutput, leftjoy);
   frontrightdrive.set(ControlMode.PercentOutput, rightjoy);
   backleftdrive.set(ControlMode.PercentOutput, leftjoy);
   backrightdrive.set(ControlMode.PercentOutput, rightjoy);
 }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
