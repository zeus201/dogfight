package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer{
		
		public static int Timple_Sleep = 30;
			
			public static int getTimple_Sleep() {
			return Timple_Sleep;
		}

		public static void setTimple_Sleep(int timple_Sleep) {
			Timple_Sleep = timple_Sleep;
		}

		private IDogfightModel dogfightmodel;

			public DogfightController (IDogfightModel dogfightmodel) {
					super();
					this.setDogfightmodel(dogfightmodel);
			}

			//@Override
			public void orderPerform(UserOrder userOrder) {	
				
			}
			
			private void gameLoop() {
				
			}
				
				public void play() {
					
				}
				
					public void setViewSystem (IViewSystem viewSystem) {
						
					}
			
						public void LunchMissile(int player) {
				

						}

						public IDogfightModel getDogfightmodel() {
							return dogfightmodel;
						}

						public void setDogfightmodel(IDogfightModel dogfightmodel) {
							this.dogfightmodel = dogfightmodel;
						}
	}						
