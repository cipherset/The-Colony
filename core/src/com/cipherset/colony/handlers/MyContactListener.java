package com.cipherset.colony.handlers;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.ContactImpulse;
import com.badlogic.gdx.physics.box2d.ContactListener;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.Manifold;
import com.badlogic.gdx.utils.Array;

public class MyContactListener implements ContactListener{
	
	
	
	public MyContactListener(){
		super();
		
	}
	@Override
	public void beginContact(Contact c) {
		Fixture fa=c.getFixtureA();
		Fixture fb=c.getFixtureB();
	
	}

	@Override
	public void endContact(Contact c) {
		Fixture fa=c.getFixtureA();
		Fixture fb=c.getFixtureB();
		
	}

	@Override
	public void preSolve(Contact contact, Manifold oldManifold) {}

	@Override
	public void postSolve(Contact contact, ContactImpulse impulse) {}
	
	

	

}
