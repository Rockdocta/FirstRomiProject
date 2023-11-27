package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class TurnAroundCommand extends CommandBase {

  public TurnAroundCommand(Drivetrain drivetrain) 
  {
      new TurnDegrees(.5, 180, drivetrain);
  }
}