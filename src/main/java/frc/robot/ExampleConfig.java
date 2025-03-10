package frc.robot;

import frc.robot.core.util.controllers.ButtonMap;
import frc.robot.core.util.controllers.Xbox;

public class ExampleConfig {
  public class Subsystems {
    public static final boolean DRIVETRAIN_ENABLED = false;
    public static final boolean ELEVATOR_ENABLED = false;
    public static final boolean FLYWHEEL_ENABLED = false;
    public static final boolean INTAKE_ENABLED = true;
  }

  public class Controllers {
    public static final boolean DRIVER_ENALBED = false;
    public static final boolean OPERATOR_ENABLED = true;

    public static ButtonMap getDriverController() {
      return new Xbox();
    }

    public static ButtonMap getOperatorController() {
      return new Xbox();
    }
  }
}
