package tn.enis.test;

import tn.enis.command.GarageDoorOpenCommand;
import tn.enis.command.LightOnCommand;
import tn.enis.invoker.SimpleRemoteControl;
import tn.enis.receiver.GarageDoor;
import tn.enis.receiver.Light;

public class RemoteControlTest {
	public static void main(String argv[]) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		remote.setCommand(lightOn); // encapsuler la commande
		remote.buttonWasPressed(); // allumer la lumière
		remote.setCommand(garageOpen); // encapsuler la commande
		remote.buttonWasPressed(); // ouvrir la porte du garage
	}

}
