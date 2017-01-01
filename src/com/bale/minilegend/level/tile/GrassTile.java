package com.bale.minilegend.level.tile;

import com.bale.minilegend.gfx.Color;
import com.bale.minilegend.gfx.Screen;
import com.bale.minilegend.level.Level;

public class GrassTile extends Tile {

	public GrassTile(int id) {
		super(id);
	}
	
	public void render(Screen screen, Level level, int x, int y) {
		int col = Color.get(level.grassColor, level.grassColor, level.grassColor + 111, level.grassColor + 111);
		
		//screen.render(x * 16 + 8, y * 16 + 0, 0, col, 0);
		screen.render(x * 16 + 0, y * 16 + 0, 2, col, 0);
		screen.render(x * 16 + 8, y * 16 + 0, 2, col, 0);
		screen.render(x * 16 + 0, y * 16 + 8, 2, col, 0);
		screen.render(x * 16 + 8, y * 16 + 8, 2, col, 0);
		
	}
	
	public void tick(Level level, int xt, int yt) {
	}

}
