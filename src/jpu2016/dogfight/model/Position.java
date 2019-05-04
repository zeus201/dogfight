package jpu2016.dogfight.model;

public class Position {
	private double x ;
	 private double y ;
	 @SuppressWarnings("unused")
	private double maxX ;
	 @SuppressWarnings("unused")
	private double maxY ;
	private Position position;
	 public double getX() {
			return x;
		}
		public double getY() {
			return y;
		}
		public void setX(double x) {
			this.x = x;
		}
		public void setY(double y) {
			this.y = y;
		}
		protected void setMaxX(double maxX) {
			this.maxX = maxX;
		}
		protected void setMaxY(double maxY) {
			this.maxY = maxY;
		}
		public Position ( double x, double y, double maxX, double maxY) {
			super();
			this.x = x;
			this.y = y;
			this.maxX = maxX;
			this.maxY = maxY;
		}
		public Position (Position position) {
			this.setPosition(position);
		}
		public Position getPosition() {
			return position;
		}
		public void setPosition(Position position) {
			this.position = position;
		}
}
