package com.cipherset.colony.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.cipherset.colony.handlers.GameStateManager;
import com.cipherset.colony.handlers.MyInput;

public class Play extends GameState {

	
	
	
	

	

	public Play(GameStateManager gsm)
	{
		super(gsm);
		
		
	}

	@Override
	public void handleInput(float dt) {
		
		
	
		if(MyInput.isPressed(MyInput.ESC))
		{
			Gdx.app.exit();
		}
	
		
	}

	@Override
	public void update(float dt) {
		handleInput(dt);
		
		
		
		
	}

	@Override
	public void render() {
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}
	
	
	
	
}
