package SnakeV2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


public class Snake {
	
	List<Point> snakePoints;
	int xDir, yDir;
	boolean isMoving, elongate;
	final int STARTSIZE = 20, STARTX = 150, STARTY = 150;
	
	
	
	
	
	public Snake(){
		snakePoints = new ArrayList<Point>();
		xDir = 0;
		yDir = 0;
		isMoving = false;
		elongate = false;
		snakePoints.add(new Point(STARTX, STARTY));
		for(int i = 1; 1 < STARTSIZE; i++){
			snakePoints.add(new Point(STARTX - 1 * 4, STARTY));
			}
		
		}
	
	public void draw(Graphics g){
		g.setColor(Color.white);
		for(Point p : snakePoints){
				g.fillRect(p.getX(),p.getY(), 4, 4);
				}
}
	
	public int getXDir(){
		return xDir;
		}
	public int getYDir(){
		return yDir;
		}
	
	public void setXDir(int x){
		xDir = x;
		}
	
	public void setYDir(int y){
		yDir = y;
		
		}
	//X position of head of snake
	public int getX(){
		return snakePoints.get(0).getX();
		}
	public int getY(){
		return snakePoints.get(0).getY();
		
	}

	}
	
