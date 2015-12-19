  package com.cipherset.colony.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.cipherset.colony.Game;
import com.cipherset.colony.handlers.GameStateManager;

public abstract class GameState {
	protected GameStateManager gsm;
	protected Game game;
	
	protected SpriteBatch sb;
	protected OrthographicCamera cam;
	protected OrthographicCamera HUDcam;
	protected GameState(GameStateManager gsm)
	{
		this.gsm=gsm;
		game=gsm.game();
		sb=game.getSB();
		cam=game.getCam();
		HUDcam=game.getHudCam();
		
	}
	
	public abstract void handleInput(float dt);
	public abstract void update(float dt);
	public abstract void render();
	public abstract void dispose();

}
