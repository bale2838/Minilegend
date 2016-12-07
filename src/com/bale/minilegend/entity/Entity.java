package com.bale.minilegend.entity;

public class Entity {
	public int x, y;
	public boolean removed;
	
	public void remove() {
		removed = true;
	}
}
