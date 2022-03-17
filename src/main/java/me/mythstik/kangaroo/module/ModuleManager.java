package me.mythstik.kangaroo.module;

import java.util.ArrayList;
import java.util.List;

import me.mythstik.kangaroo.Main;
import me.mythstik.kangaroo.module.modules.movement.Sprint;

public class ModuleManager {
	
	public ArrayList<Module> modules;
	
	public ModuleManager() {
		(modules = new ArrayList<Module>()).clear();
		//Render
		
		
		
		//Combat
		
		
		
		//Movement
		
		this.modules.add(new Sprint());
		
		//Client
		
		
		
		//Ghost
		
		
		
		//Player
		
		
		
		//Exploits
		
		
		
	}
	
	public Module getModule (String name) {
		for(Module mod : this.modules) {
			if(mod.getName().equalsIgnoreCase(name)) {
				return mod;
			}
		}
		return null;
	}
	
	public ArrayList<Module> getModuleList() {
		return this.modules;
	}
	
	public static List<Module> getModulesByCategory(Category c) {
		List<Module> modules = new ArrayList<Module>();
		
		for(Module mod : Main.moduleManager.modules) {
			if(mod.getCategory() == c)
				modules.add(mod);
		}
		return modules;
	}
	
}






