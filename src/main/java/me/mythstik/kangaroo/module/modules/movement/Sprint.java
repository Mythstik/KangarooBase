package me.mythstik.kangaroo.module.modules.movement;

import org.lwjgl.input.Keyboard;

import me.mythstik.kangaroo.module.Category;
import me.mythstik.kangaroo.module.Module;

public class Sprint extends Module{
	
	public Sprint() {
		super("Sprint", "Automatically Sprints for you.", Category.MOVEMENT);
		this.setKey(Keyboard.KEY_M);
	}

}
