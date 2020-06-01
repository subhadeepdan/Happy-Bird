package com.sdskdevelopers.zombiebird;

import com.badlogic.gdx.Game;
import com.sdskdevelopers.screens.SplashScreen;
import com.sdskdevelopers.zbhelpers.AssetLoader;

public class ZBGame extends Game {

	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}

}