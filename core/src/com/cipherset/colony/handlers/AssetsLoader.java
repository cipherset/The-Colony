package com.cipherset.colony.handlers;

import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class AssetsLoader {
	private HashMap<String,Texture> textures;
	
	public AssetsLoader(){
		
		textures=new HashMap<String,Texture>();
		
	}
	
	public void LoadTexture(String path,String key)
	{
	 Texture tex=new Texture (Gdx.files.internal(path));
	 textures.put(key, tex);
	 
	}
	public Texture  getTexture(String key){
		return textures.get(key);

}
	public void disposeTexture(String key){
		 	Texture tex=textures.get(key);
		 	if(tex!=null)
		 		tex.dispose();
	}
}