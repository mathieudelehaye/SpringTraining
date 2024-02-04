package com.mdelehaye.beginspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mdelehaye.beginspringframework.game.GameRunner;
import com.mdelehaye.beginspringframework.game.OtherVideoGame;
import com.mdelehaye.beginspringframework.game.ThirdVideoGame;
import com.mdelehaye.beginspringframework.game.VideoGame;
import com.mdelehaye.beginspringframework.helloworld.HelloWorldConfiguration;

public class App01GamingBasicJava {

	public static void main(String[] args) { 
			var game = new VideoGame();
//			var game = new OtherVideoGame();
//			var game = new ThirdVideoGame();
//					
			var gameRunner = new GameRunner(game);
			gameRunner.run();		
	}
}
