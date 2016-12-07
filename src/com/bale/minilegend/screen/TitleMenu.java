package com.bale.minilegend.screen;

public class TitleMenu extends Menu {
	private int selected = 0;
	
	private static final String[] options  = { "Start game", "How to play", "About" };
	
	public TitleMenu() {
	}
	
	public void tick() {
		if (input.up.clicked) selected--;
		if (input.down.clicked) selected++;
		
		int len = options.length;
		if (selected < 0) selected += len;
		if (selected >= len) selected -= len;
		
		if (input.attack.clicked || input.menu.clicked) {
			if(selected == 0) {
				
			}
		}
	}

}
