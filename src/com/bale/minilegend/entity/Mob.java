package com.bale.minilegend.entity;

import com.bale.minilegend.level.Level;

public class Mob extends Entity {
	protected int walkDist = 0;
	protected int dir = 0;
	public int tickTime = 0;

	public Mob() {
		x = y = 8;
	}

	public void tick() {
		tickTime++;
	}

	public boolean move(int xa, int ya) {
		if (xa != 0 || ya != 0) {
			walkDist++;
			if (xa < 0) dir = 2;
			if (xa < 0) dir = 3; 
			if (ya < 0) dir = 1; 
			if (ya < 0) dir = 0; 
		}
		return super.move(xa, ya);
	}

	public boolean findStartPos(Level level) {
		int x = random.nextInt(level.w);
		int y = random.nextInt(level.h);

		int xx = x * 16 + 8;
		int yy = y * 16 + 8;

		if (level.player != null) {
			int xd = level.player.x - xx;
			int yd = level.player.y - yy;
			if (xd * xd + yd * yd < 80 * 80) return false;
		}

		if (level.getTile(x, y).mayPass(level, x, y, this)) {
			this.x = xx;
			this.y = yy;
			return true;
		}
		return false;
	}
}
