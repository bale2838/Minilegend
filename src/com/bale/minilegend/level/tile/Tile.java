package com.bale.minilegend.level.tile;

import java.util.Random;

import com.bale.minilegend.entity.Entity;
import com.bale.minilegend.gfx.Screen;
import com.bale.minilegend.level.Level;

public class Tile {
	public static int tickCount = 0;
	protected Random random  = new Random();
	
	public static Tile[] tiles = new Tile[256];
	public static Tile grass = new GrassTile(0);
	
	public boolean connectsToGrass = false;
	
	public final byte id;
	

	public Tile(int id) {
		this.id = (byte)id;
		if (tiles[id] != null) throw new RuntimeException("Duplicate tile ids!");
		tiles[id] = this;
	}
	
	public void render(Screen screen, Level level, int x, int y) {
	}
	
	public boolean mayPass(Level level, int x, int y, Entity e) {
		return true;
	}
	
	public void tick(Level level, int xt, int yt) {
	}
	
	

}
