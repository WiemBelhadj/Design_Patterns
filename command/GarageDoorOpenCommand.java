package tn.enis.command;

import tn.enis.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	private GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
		garageDoor.lighton();
	}

}