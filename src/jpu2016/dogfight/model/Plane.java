package jpu2016.dogfight.model;

public class Plane extends Mobile {
	private static int SPEED = 2 ;
	private static  int WIDTH = 100 ;
	private static int HEIGHT = 30 ;
	private static int player ;
	public boolean isPlayer (int player) {
		return false;}
	public boolean hit() {
		return false;};
	public Plane(Direction direction, Position position, Dimension dimension, int speed, String Image) {
		super(direction, position, dimension, speed, Image);
		// TODO Auto-generated constructor stub
	}
	
	
}
