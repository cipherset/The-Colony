package com.cipherset.colony.handlers;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;

public class MyInputProcessor extends InputAdapter{

	public boolean keyDown(int k)
	{
		if(k==Keys.LEFT)
			MyInput.setKey(MyInput.LEFT, true);
		if(k==Keys.RIGHT)
			MyInput.setKey(MyInput.RIGHT, true);
		if(k==Keys.UP)
			MyInput.setKey(MyInput.UP, true);
		if(k==Keys.DOWN)
			MyInput.setKey(MyInput.DOWN, true);
		if(k==Keys.ESCAPE)
			MyInput.setKey(MyInput.ESC, true);
		if(k==Keys.C)
			MyInput.setKey(MyInput.CHANGE, true);
		if(k==Keys.X)
			MyInput.setKey(MyInput.SHOOT, true);
		return true;
	}
	public boolean keyUp(int k)
	{
		if(k==Keys.LEFT)
			MyInput.setKey(MyInput.LEFT, false);
		if(k==Keys.RIGHT)
			MyInput.setKey(MyInput.RIGHT, false);
		if(k==Keys.UP)
			MyInput.setKey(MyInput.UP, false);
		if(k==Keys.DOWN)
			MyInput.setKey(MyInput.DOWN, false);
		if(k==Keys.ESCAPE)
			MyInput.setKey(MyInput.ESC, false);
		if(k==Keys.C)
			MyInput.setKey(MyInput.CHANGE, false);
		if(k==Keys.X)
			MyInput.setKey(MyInput.SHOOT, false);
		return true;
	}
}
