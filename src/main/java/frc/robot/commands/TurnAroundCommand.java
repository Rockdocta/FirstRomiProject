package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;

public class TurnAroundCommand extends SequentialCommandGroup {

  public TurnAroundCommand(Drivetrain drivetrain) {
    addCommands(
        new TurnDegrees(.5, 180, drivetrain));
  }
}