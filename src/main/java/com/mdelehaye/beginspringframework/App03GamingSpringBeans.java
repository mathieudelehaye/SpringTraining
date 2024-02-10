package com.mdelehaye.beginspringframework;

import com.mdelehaye.beginspringframework.game.GameRunner;
import com.mdelehaye.beginspringframework.game.GamingConsole;
import com.mdelehaye.beginspringframework.game.OtherVideoGame;
import com.mdelehaye.beginspringframework.game.ThirdVideoGame;
import com.mdelehaye.beginspringframework.game.VideoGame;
import com.mdelehaye.beginspringframework.helloworld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
				
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		};
	}
}
