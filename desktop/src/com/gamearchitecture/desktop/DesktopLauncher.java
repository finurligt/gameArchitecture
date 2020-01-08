package com.gamearchitecture.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gamearchitecture.main;


public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width= main.WIDTH;
		config.height=main.HEIGHT;
		config.title=main.TITLE;
		new LwjglApplication(new main(), config);
	}
}
