package com.mdelehaye.beginspringframework.game;

public class ThirdVideoGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Move up");
		
	}

	@Override
	public void down() {
		System.out.println("Move down");
		
	}

	@Override
	public void left() {
		System.out.println("Turn left");
		
	}

	@Override
	public void right() {
		System.out.println("Turn right");
		
	}

}
