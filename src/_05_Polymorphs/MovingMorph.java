package _05_Polymorphs;

import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	
	private int x;
	private int y;
	private int width;
	private int height;

	
	private int check = 0;
	
	public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}

	int speedX = 10;
	int speedY = 10;
	@Override
	public void update() {
		// TODO Auto-generated method stub
		x = speedX+x;
		y = speedY+y;
		
		if(x >= PolymorphWindow.WIDTH && x <= 0) {
		speedX = -speedX;	
		}
		
		if(y >= PolymorphWindow.HEIGHT && y <= 0) { //zero = bottom
			speedY = -speedY;
		}


	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
