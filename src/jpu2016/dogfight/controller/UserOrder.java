package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;

public class UserOrder implements IUserOrder {

	
	private int player;
	private Order order;

	
	public void setPlayer(int player) {
		this.player = player;
	}


	public UserOrder(int Player , Order order) {
		super();
		this.player = player;
		this.order = order;
}


	public UserOrder() {
		// TODO Auto-generated constructor stub
	}


	@Override
		 
			public Order getOrder() {
		// TODO Auto-generated method stub
		return order ;
	}

	@Override
	
			public int getPlayer() {
		// TODO Auto-generated method stub
		return 1;
	}

	
}
