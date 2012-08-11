package patterns.behavioral.command;

public class TurnOnLightCommand implements Command {

	private Light light;
	
	public TurnOnLightCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.turnOn();
	}
}
