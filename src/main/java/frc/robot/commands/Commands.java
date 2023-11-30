package frc.robot.commands;

import frc.robot.subsystems.IDrivetrain;

public class Commands {

    public static IDrivetrain Drivetrain;

    private static IDrivetrain getDrivetrain()
    {
        if (Drivetrain == null)
            throw new IllegalStateException("The Drivetrain variable must be initialized prior to using the Commands methods.");

        return Drivetrain;
    }

    public static TurnDegrees getTurnAroundCommand()
    {
        return new TurnDegrees(.5, 180, getDrivetrain());
    }

    public static DrawTriangle getDrawTriangleCommand()
    {
         return new DrawTriangle(getDrivetrain());
    }

    public static DrawSquare getDrawSquareCommand() {
        return new DrawSquare(getDrivetrain());
    }

    public static ArcadeDrive getArcadeDriveCommand(double yRight, double xLeft)
    {
        return new ArcadeDrive(getDrivetrain(), () -> yRight, () -> xLeft);
    }
}
