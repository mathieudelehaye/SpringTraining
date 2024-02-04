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
//	@Bean 
//	public GameRunner runner(GamingConsole console) {
//		return new GameRunner(console);	
//	}	
	
	@Bean
//	@Primary 
	public GamingConsole game() {
		return new VideoGame();
	} 	

//	@Bean 
//	public GamingConsole otherVideoGameConsole() {
//		return new OtherVideoGame();
//	}
//	
//	@Bean 
//	public GamingConsole thirdVideoGameConsole() {
//		return new ThirdVideoGame();
//	}
}
