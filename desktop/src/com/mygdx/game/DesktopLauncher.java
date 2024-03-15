package com.mygdx.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.mygdx.game.FlappyDemo;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {

	public static AdHandler handler = new AdHandler() {
		@Override
		public void showAds(boolean show) {

		}

		@Override
		public void showOrLoadInterstital() {

		}

		@Override
		public void loadInterstitial() {

		}

		@Override
		public void showInterstitial() {

		}
	};
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setWindowedMode(FlappyDemo.WIDTH, FlappyDemo.HEIGHT);
		config.setTitle(FlappyDemo.TITLE);
		new Lwjgl3Application(new FlappyDemo(handler), config);
	}
}
