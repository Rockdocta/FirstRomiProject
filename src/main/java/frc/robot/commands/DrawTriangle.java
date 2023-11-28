package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;

public class DrawTriangle extends SequentialCommandGroup 
{
    public DrawTriangle(Drivetrain drivetrain)
    {
        addCommands(
            new DriveDistance(.4, 10, drivetrain),
            new TurnDegrees(.4, 120, drivetrain),
            new DriveDistance(.4, 10, drivetrain),
            new TurnDegrees(.4, 120, drivetrain),
            new DriveDistance(.4, 10, drivetrain),
            new TurnDegrees(.4, 120, drivetrain));
    }   
}
