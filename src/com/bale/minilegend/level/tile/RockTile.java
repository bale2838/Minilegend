package com.bale.minilegend.level.tile;

import com.bale.minilegend.entity.Entity;
import com.bale.minilegend.gfx.Color;
import com.bale.minilegend.gfx.Screen;
import com.bale.minilegend.level.Level;

public class RockTile extends Tile {

	public RockTile(int id) {
		super(id);
	}
	
	public void render(Screen screen, Level level, int x, int y) {
		int col = Color.get(444, 444, 444, 444);
	}
	
	public boolean mayPass(Level level, int x, int y, Entity e) {
		return false;
	}
	
	public void tick(Level level, int xt, int yt) {	
	}
}