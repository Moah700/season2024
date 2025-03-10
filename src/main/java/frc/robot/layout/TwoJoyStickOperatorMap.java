package frc.robot.layout;

import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.core.util.controllers.ButtonMap.Button;
import frc.robot.core.util.controllers.GameController;

public class TwoJoyStickOperatorMap extends OperatorMap {
  public TwoJoyStickOperatorMap(GameController controller) {
    super(controller);
  }

  @Override
  public JoystickButton getTestButton() {
    return controller.getButton(Button.BUTTON_A);
  }

  @Override
  public JoystickButton getIntakeButton() {
    return controller.getButton(Button.BUTTON_B);
  }

  @Override
  public JoystickButton getRunMotorButton() {
    return controller.getButton(Button.BUTTON_RIGHT_BUMPER);
  }

  @Override
  public JoystickButton getStopMotorButton() {
    return controller.getButton(Button.BUTTON_LEFT_BUMPER);
  }

  @Override
  public void registerCommands() {
    super.registerCommands();
  }
}
