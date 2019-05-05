package jpu2016.dogfight.model;

import java.awt.*;
import java.awt.Point;

public class Mobile implements IMobile {

	public int speed ;
	private Direction direction;
	private Dimension dimension;
	private String Image;
	public Mobile (Direction direction , Position position , Dimension dimension , int speed , String Image) 
	{
		this.direction =direction ;
		this.dimension = dimension;
		this.speed = speed ;
		this.Image = Image;
	}
	
	public Mobile(Direction direction, Dimension dimension) {
		this.direction =direction ;
		this.dimension = dimension;
	}

	public void placeInArea (IArea area) {};
	
	public void moveUp() {};
	public void moveDown() {}
	public void moveLeft() {}
	public void moveRight () {};
	public Color getColor() {
		return null;};
	public IDogfightModel getDogfightModel() {
		return getDogfightModel();}
	public void setDogfightModel(IDogfightModel dogfightModel) {}

	
	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	@Override
	public Point getPostion() {
		return null;
		
	}

	
	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
//Mobile bxZD259HY6``	  pàuhc s)à	cv hn,;:!
	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		
	}

	

}
