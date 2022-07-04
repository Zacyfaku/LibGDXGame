package com.denisbondd111.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;
	private float x;
	private float y;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		x = 0.0f;
		y = 0.0f;
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);
		x += 0.5f;
		y += 0.5f;
		batch.begin();
		batch.draw(img, x, y);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
