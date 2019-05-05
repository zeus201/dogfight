package jpu2016.dogfight.model;

import java.awt.Image;

public class Sky implements IArea {
	Dimension dimension ; 
    public Sky (Dimension dimension) {
    	super();
    	this.dimension = dimension;
    }
    
    
    
	public Dimension getDimension() {
		return dimension;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

}
