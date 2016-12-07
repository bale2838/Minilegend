package com.bale.minilegend.screen;

import com.bale.minilegend.gfx.Screen;

public class DeadMenu extends Menu {
	private int inputDelay = 60;

	public DeadMenu() {
	}

	public void tick() {
		if (inputDelay > 0 ) 
			inputDelay--;
		else if (input.attack.clicked || input.menu.clicked) {
			game.setMenu(new TitleMenu());
		}
	}
	
	public void render(Screen screen) {
		
	}
	
}

