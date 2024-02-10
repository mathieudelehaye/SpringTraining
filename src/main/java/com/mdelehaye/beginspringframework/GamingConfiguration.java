package com.mdelehaye.beginspringframework;

import com.mdelehaye.beginspringframework.game.GameRunner;
import com.mdelehaye.beginspringframework.game.GamingConsole;
import com.mdelehaye.beginspringframework.game.OtherVideoGame;
import com.mdelehaye.beginspringframework.game.ThirdVideoGame;
import com.mdelehaye.beginspringframework.game.VideoGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		return new VideoGame();
	}
	
	@Bean
	public GameRunner gameRunner() {
//	public GameRunner gameRunner(GamingConsole game) {
//		return new GameRunner(game);
		return new GameRunner(game());
	}
}
