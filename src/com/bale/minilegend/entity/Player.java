package com.bale.minilegend.entity;

import com.bale.minilegend.Game;
import com.bale.minilegend.InputHandler;
import com.bale.minilegend.gfx.Color;
import com.bale.minilegend.gfx.Screen;
import com.bale.minilegend.level.Level;
import com.bale.minilegend.level.tile.Tile;

public class Player extends Mob {
	private InputHandler input;
	public Game game;
	
	public Player(Game game, InputHandler input) {
		this.game = game;
		this.input = input;
		x = 24;
		y = 24;
	}
	
	public void tick() {
		super.tick();
		
		Tile onTile = level.getTile(x >> 4, y >> 4);
		
		int xa = 0;
		int ya = 0;
		if (input.up.down) ya--;
		if (input.down.down) ya++;
		if (input.left.down) xa--;
		if (input.right.down) xa++;
	}
	
	public void render(Screen screen) {
		int xt = 0;
		int yt = 14;
		
		int flip1 = (walkDist >> 3) & 1;
		int flip2 = (walkDist >> 3) & 1;
		
		if (dir == 1) {
			xt += 2;
		}
		
		if (dir > 1) {
			flip1 = 0;
			flip2 = ((walkDist >> 4) & 1);
			
			if (dir == 2) {
				flip1 = 1;
			}
			
			xt += 4 + ((walkDist >> 3) & 1) * 2;
		}
		
		int xo = x - 8;
		int yo = y - 11;
		
		int col = Color.get(-1, 100, 220, 532);
		screen.render(xo + 8 * flip1, yo + 0, xt + yt * 32, col, flip1);
		screen.render(xo + 8 - 8 * flip1, yo + 0, xt + 1 + yt * 32, col, flip1);	
	}
	public boolean findStartPos(Level level) {
		while (true) {
			int x = random.nextInt(level.w);
			int y = random.nextInt(level.h);
			if (level.getTile(x, y) == Tile.grass) {
				this.x = x * 16 + 8;
				this.y = y * 16 + 8;
				return true;
			}
		}
	}
}
