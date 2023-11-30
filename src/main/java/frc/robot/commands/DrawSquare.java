package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.IDrivetrain;

public class DrawSquare extends SequentialCommandGroup 
{
    public DrawSquare(IDrivetrain drivetrain)
    {
        addCommands(
            new DriveDistance(.5, 10, drivetrain),
            new TurnDegrees(.5, 90, drivetrain),
            new DriveDistance(.5, 10, drivetrain),
            new TurnDegrees(.5, 90, drivetrain),
            new DriveDistance(.5, 10, drivetrain),
            new TurnDegrees(.5, 90, drivetrain),
            new DriveDistance(.5, 10, drivetrain),
            new TurnDegrees(.5, 90, drivetrain));
    }   
}
