/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019-2020 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.networktables.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  private static final String MiddleAuto = "Middle Auto";
  private static final String LeftAuto = "Left Auto";
  private static final String RightAuto = "Right Auto";
  private String m_autoSelected;
  private final SendableChooser<String> m_chooser = new SendableChooser<>();

  CANSparkMax leftBackM; 
  CANSparkMax leftFrontM; 
  SpeedControllerGroup leftMotors;

  CANSparkMax rightBackM;
  CANSparkMax rightFrontM; 
  SpeedControllerGroup rightMotors;
    
  CANSparkMax shooterM1; 
  CANSparkMax shooterM2; 
  SpeedControllerGroup shooterM;
    
  CANSparkMax intakeM;
  CANSparkMax intakeDownM;

  CANSparkMax tunnelM1;
   
  PWMTalonSRX lazySusanM;

  PWMTalonSRX liftM;

  // Vector is the name of the Drive Train 
  DifferentialDrive Vector;
  
  CANEncoder leftBackE;

  Joystick xboxC;
  Joystick logC;

  Timer m_timer;
  Timer lazySusanTimer;
  Timer liftTimer;

  boolean intakePressed = false;

  private boolean m_LimelightHasValidTarget = false;
  private double m_LimelightDriveCommand = 0.0;
  private double m_LimelightSteerCommand = 0.0;

  double delayTime = 0.0;

  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  @Override
  public void robotInit() {
    m_chooser.setDefaultOption("Middle Auto", MiddleAuto);
    m_chooser.addOption("Right Auto", RightAuto);
    m_chooser.addOption("Leff Auto", LeftAuto);
    SmartDashboard.putData("Auto choices", m_chooser);

    leftBackM = new CANSparkMax(4, MotorType.kBrushless);
    leftFrontM = new CANSparkMax(3, MotorType.kBrushless);
    leftMotors = new SpeedControllerGroup(leftBackM, leftFrontM);

    rightBackM = new CANSparkMax(1, MotorType.kBrushless); 
    rightFrontM = new CANSparkMax(2,MotorType.kBrushless);
    rightMotors = new SpeedControllerGroup(rightBackM, rightFrontM); 
    Vector = new DifferentialDrive(leftMotors, rightMotors);
    xboxC = new Joystick(0);

    m_timer = new Timer();

    /*
    shooterM1 = new CANSparkMax(4, MotorType.kBrushless); 
    shooterM2 = new CANSparkMax(5, MotorType.kBrushless); 
    shooterM = new SpeedControllerGroup(shooterM1, shooterM2);

    intakeM = new CANSparkMax(6, MotorType.kBrushless);
    intakeDownM = new CANSparkMax(8, MotorType.kBrushless);

    tunnelM1 = new CANSparkMax(7, MotorType.kBrushless);

    lazySusanM = new PWMTalonSRX(2);

    liftM = new PWMTalonSRX(4);

    leftBackE = new CANEncoder(leftBackM);
    
    logC = new Joystick(1);
    
    lazySusanTimer = new Timer();
    liftTimer = new Timer();

    UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
    camera.setResolution(640, 320);
    */
  
  }

  /**
   * This function is called every robot packet, no matter the mode. Use this for
   * items like diagnostics that you want ran during disabled, autonomous,
   * teleoperated and test.
   *
   * <p>
   * This runs after the mode specific periodic functions, but before LiveWindow
   * and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable chooser
   * code works with the Java SmartDashboard. If you prefer the LabVIEW Dashboard,
   * remove all of the chooser code and uncomment the getString line to get the
   * auto name from the text box below the Gyro
   *
   * <p>
   * You can add additional auto modes by adding additional comparisons to the
   * switch structure below with additional strings. If using the SendableChooser
   * make sure to add them to the chooser code above as well.
   */
  @Override
  public void autonomousInit() {
    m_autoSelected = m_chooser.getSelected();
    // m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
    System.out.println("Auto selected: " + m_autoSelected);
    
    //leftBackE.setPosition(0.0);
     
    m_timer.reset();
    m_timer.start();
    /*
    liftTimer.reset();
    liftTimer.start();
    lazySusanTimer.reset();
    lazySusanTimer.start();
    */
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() 
  {
    //Update_Limelight_Tracking();

    switch (m_autoSelected) 
    { 
      case RightAuto: 
        if (m_timer.get() < (1 + delayTime))
          Vector.tankDrive(0.4, 0.4);  
      break; 
      case MiddleAuto: 
        if (m_timer.get() < (1 + delayTime))
          Vector.tankDrive(0.4, 0.4); 
        if(m_timer.get() > (1.5 + delayTime) && m_timer.get() < (2.2 + delayTime)) 
          Vector.tankDrive(-0.4, 0.4); 
        if(m_timer.get() > (3 + delayTime) && m_timer.get() < (5 + delayTime)) 
          Vector.tankDrive(0.4, 0.4); 
        if(m_timer.get() > (5.5 + delayTime) && m_timer.get() < (6.2 + delayTime)) 
          Vector.tankDrive(-0.4, 0.4);
      break;
      case LeftAuto: 
        if (m_timer.get() < (1 + delayTime)) 
          Vector.tankDrive(-0.4, -0.4);
        if (m_timer.get() > (1.5 + delayTime) && m_timer.get() < (3 + delayTime)) 
          Vector.tankDrive(0.4, 0.4);
        
        /*
        if (m_LimelightHasValidTarget)
          Vector.arcadeDrive(m_LimelightDriveCommand,m_LimelightSteerCommand);
        else
          Vector.arcadeDrive(0.0,0.0);
        */
        
      break; 
    }

    // Encoder
    /*
     * if(leftBackE.getPosition() >= 10.00000) { leftBackM.set(0.0); } else{
     * leftBackM.set(0.02); }
     */

  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {

    // W Drive the robot!
    Vector.tankDrive(-xboxC.getRawAxis(1), -xboxC.getRawAxis(5)); 

    // W Lazy Susan 4 Spins!
    /*
    if(lazySusanTimer.get() >= 2.75)   
      lazySusanM.set(0.0);

    if (xboxC.getRawButtonPressed(2)) {
      lazySusanTimer.reset();
      lazySusanTimer.start();
      lazySusanM.set(0.5);
    }
    
    // W Lifts to the top!
    if(liftTimer.get() >= 3.0)
      liftM.set(0.0);

    if (logC.getRawButtonPressed(1))
    {
      liftTimer.reset();
      liftTimer.start();
      liftM.set(0.7);
    }
    
    // NW Shooting the ball
    if (xboxC.getRawButtonPressed(4)) 
    { 
      m_timer.reset(); 
      m_timer.start(); 

      if(m_timer.get() < 10) 
        shooterM.set(1.0); 
      else 
        shooterM.set(0.0);

      if (m_timer.get() > 3 && m_timer.get() < 10) 
        tunnelM1.set(1.0); 
      else
        tunnelM1.set(0.0); 
    }

    // NW Picking up Ball
    if (xboxC.getRawButtonPressed(1)) 
    { 
      if (intakePressed == false) 
      {
        intakeM.set(-1.0); 
        tunnelM1.set(0.2);
        intakePressed = true; 
      } 
      if (intakePressed == true) 
      { 
        intakeM.set(0.0); 
        tunnelM1.set(0.0); 
        intakePressed = false;
      } 
    }

    Update_Limelight_Tracking();

    if (xboxC.getRawAxis(3) > 0)
        {
          if (m_LimelightHasValidTarget)
          {
                Vector.arcadeDrive(m_LimelightDriveCommand,m_LimelightSteerCommand);
          } 
          else
          {
                Vector.arcadeDrive(0.0,0.0);
          }
        }

    SmartDashboard.putNumber("Encoder Position", lazySusanM.getPosition());
    */
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }

  public void Update_Limelight_Tracking()
  {
        // These numbers must be tuned for your Robot!  Be careful!
        final double STEER_K = 0.03;                    // how hard to turn toward the target
        final double DRIVE_K = 0.26;                    // how hard to drive fwd toward the target
        final double DESIRED_TARGET_AREA = 13.0;        // Area of the target when the robot reaches the wall
        final double MAX_DRIVE = 0.7;                   // Simple speed limit so we don't drive too fast

        double tv = NetworkTableInstance.getDefault().getTable("limelight").getEntry("tv").getDouble(0);
        double tx = NetworkTableInstance.getDefault().getTable("limelight").getEntry("tx").getDouble(0);
        double ty = NetworkTableInstance.getDefault().getTable("limelight").getEntry("ty").getDouble(0);
        double ta = NetworkTableInstance.getDefault().getTable("limelight").getEntry("ta").getDouble(0);

        if (tv < 1.0)
        {
          m_LimelightHasValidTarget = false;
          m_LimelightDriveCommand = 0.0;
          m_LimelightSteerCommand = 0.0;
          return;
        }

        m_LimelightHasValidTarget = true;

        // Start with proportional steering
        double steer_cmd = tx * STEER_K;
        m_LimelightSteerCommand = steer_cmd;

        // try to drive forward until the target area reaches our desired area
        double drive_cmd = (DESIRED_TARGET_AREA - ta) * DRIVE_K;

        // don't let the robot drive too fast into the goal
        if (drive_cmd > MAX_DRIVE)
        {
          drive_cmd = MAX_DRIVE;
        }
        m_LimelightDriveCommand = drive_cmd;
  }

}