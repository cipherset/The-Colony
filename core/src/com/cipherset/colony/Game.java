package com.cipherset.colony;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.cipherset.colony.handlers.AssetsLoader;
import com.cipherset.colony.handlers.GameStateManager;
import com.cipherset.colony.handlers.MyInput;
import com.cipherset.colony.handlers.MyInputProcessor;

public class Game implements  ApplicationListener {

	public static String TITLE="The Last Heroes";
	public static int V_WIDTH=320;
	public static int V_HEIGHT=240;
	public static final int SCALE=2;
	
	
	private SpriteBatch sb;
	private OrthographicCamera cam;
	private OrthographicCamera HUDcam;
	private GameStateManager gsm;
	
	public static AssetsLoader res; 	
	
	public static final float STEP=1/60f;
	private float accum;
	
	@Override
	public void create() {
		Gdx.input.setInputProcessor(new MyInputProcessor());
		res= new AssetsLoader();
		loadAssets();
		
		cam=new OrthographicCamera();
		cam.setToOrtho(false, V_WIDTH, V_HEIGHT);
		HUDcam=new OrthographicCamera();
		HUDcam.setToOrtho(false,V_WIDTH,V_HEIGHT);
		sb=new SpriteBatch();
		sb.setProjectionMatrix(cam.combined);
		
		gsm=new GameStateManager(this);
		
	}

	@Override
	public void resize(int width, int height) {
	
	}

	@Override
	public void render() {
		accum+=Gdx.graphics.getDeltaTime();
		while(accum>=STEP){
			accum-=STEP;
			gsm.update(STEP);
			gsm.render();
		}
		MyInput.update();
	}

	@Override
	public void pause() {
	
	}

	@Override
	public void resume() {
	
	}

	@Override
	public void dispose() {
		
	}

	public SpriteBatch getSB() {
		return sb;
	}
	public OrthographicCamera getCam()
	{
		return cam;
	}
	
	public OrthographicCamera getHudCam(){return HUDcam;}
	
	
	
	private void loadAssets()
	{

	}


}
