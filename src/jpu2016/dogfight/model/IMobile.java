package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;

public interface IMobile {
	public Direction getDirection();
	public void setDirection (Direction direction);
	public Point getPostion ();
	public Dimension getDimension ();
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getSpeed() {
		return Speed;
	
	}
    public Image getImage ( ) {
    	return Image;
    }
    public void move ();
    public void placeInArea(Aera area) {}
    public boolean isPlayer(int player) {}
    public setDogfightModel(IDogfightModel dogfightModel) {}
    public default boolean hit() {
		return false;}
    public default boolean isWeapon() {
		return false;}
}
