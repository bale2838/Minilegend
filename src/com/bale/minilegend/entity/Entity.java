package com.bale.minilegend.entity;

import java.util.Random;

import com.bale.minilegend.gfx.Screen;
import com.bale.minilegend.level.Level;
import com.bale.minilegend.level.tile.Tile;

public class Entity {
	protected final Random random = new Random();
	public int x, y;
	public int xr = 6;
	public int yr = 6;
	public boolean removed;
	public Level level;
	
	public void render(Screen screen) {
	}
	
	public void tick() {
	}
	
	public void remove() {
		removed = true;
	}
	
	public final void init(Level level) {
		this.level = level;
	}
	
	public boolean intersects(int x0, int y0, int x1, int y1) {
		return !(x + xr < x0 || y + yr < y0 || x - xr > x1 || y - yr > y1);
	}
	
	public boolean blocks(Entity e) {
		return false;
	}
	
	public void hurt(Mob mob, int dmg, int attackDir) {
	}
	
	public void hurt(Tile tile, int x, int y, int dmg) {
	}
	
	public boolean move(int xa, int ya) {
		if (xa != 0 || ya != 0) {
			boolean stopped = true;
			if (xa != 0 && move2(xa, 0)) stopped = false;
			if (ya != 0 && move2(0, ya)) stopped = false;
			if (!stopped) {
				int xt = x >> 4;
				int yt = y >> 4;
			}
			return !stopped;
		}
		return true;
	}
	
	protected boolean move2(int xa, int ya) {
		if (xa != 0 && ya != 0) throw new IllegalArgumentException("Move2 can only move along one axis at a time!");
		
		
		return false;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
