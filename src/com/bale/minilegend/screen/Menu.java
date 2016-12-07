package com.bale.minilegend.screen;

import com.bale.minilegend.Game;
import com.bale.minilegend.InputHandler;

public class Menu {
	protected Game game;
	protected InputHandler input;
	
	public void init(Game game, InputHandler input) {
		this.input = input;
		this.game = game;
	}
	
	public void tick() {
	}

}
