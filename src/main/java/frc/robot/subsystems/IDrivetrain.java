package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Subsystem;

public interface IDrivetrain extends Subsystem {


    void arcadeDrive(double xaxisSpeed, double zaxisRotate);

    void resetEncoders();

    int getLeftEncoderCount();

    int getRightEncoderCount();

    double getLeftDistanceInch();

    double getRightDistanceInch();

    double getAverageDistanceInch();

   
    double getAccelX();

   
    double getAccelY();

  
    double getAccelZ();

   
    double getGyroAngleX();

  
    double getGyroAngleY();

    double getGyroAngleZ();

    
    void resetGyro();

    void periodic();

}