package com.cipherset.colony.handlers;

import java.util.Stack;

import com.cipherset.colony.Game;
import com.cipherset.colony.states.GameState;
import com.cipherset.colony.states.Play;

public class GameStateManager {
	private Game game;
	private Stack<GameState> gameStates;
	
	public static int PLAY=12312;
	
	public GameStateManager(Game game)
	{
		this.game=game;
		gameStates=new Stack<GameState>();
		pushState(PLAY);
		
	}
	
	public Game game(){
		return game;
	}
	public void update(float dt)
	{
		gameStates.peek().update(dt);
	}
	public void render()
	{
		gameStates.peek().render();
	}
	public void dispose()
	{
		
	}
	
private void setState(int state)
	{
	popState();
	pushState(state);
	
		
	}
private GameState getState(int state)
{
	if(state==PLAY) return new Play(this);
	return null;
}

	public void pushState(int state)
	{
		gameStates.push(getState(state));
	}
	public void popState()
	{
		GameState g=gameStates.pop();
		g.dispose();
		
	}




public void reset(String state){
	if(state=="PLAY"){
		this.pushState(PLAY);
	}
}
}
