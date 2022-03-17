package me.mythstik.kangaroo.module;

public enum Category {
	COMBAT("Combat"), GHOST("Ghost"), MOVEMENT("Movement"), WORLD("World"), PLAYER("Player"), RENDER("Render"), EXPLOITS("Exploits"), CLIENT("Client");
	
	public String name;
	public int moduleIndex;
	
	Category(String name) {
		this.name = name;
	}
}
