package Lecture4;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class CarStage extends JComponent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9032539863554018689L;
	int counter = 0;
	MutableCar theCar = new MutableCar(0,0, Color.BLUE, 50, 1);

	boolean carReachedBottom = false;
	
	public boolean getReachedBotton(){
		return carReachedBottom;
	}
	
	public void paintComponent(Graphics g){
		
		theCar.draw(g);

		
		if(theCar.getXPos()+60 >=getWidth() && theCar.getHorizontalDirection()>0){
			theCar.setPosition(this.getWidth()-60, theCar.getYPos()+40);
			theCar.setHorizontalDirection(-1);
			if((theCar.getYPos()+70 )>this.getHeight()){
				theCar.setPosition(this.getWidth()-60, this.getHeight()-40);
				carReachedBottom =true;
			}
			
		}
		else if(theCar.getXPos()<=0 && theCar.getHorizontalDirection()<0){
			theCar.setPosition(0, theCar.getYPos()+40);
			theCar.setHorizontalDirection(1);
			if((theCar.getYPos()+70 )>this.getHeight()){
				theCar.setPosition(this.getWidth()-60, this.getHeight()-40);
				carReachedBottom =true;
			}	
		}
		else{
			theCar.setPosition(theCar.getXPos()+theCar.getHorizontalSpeed()*theCar.getHorizontalDirection(),
			theCar.getYPos());
		}
		

		System.out.println(counter++);
	}
}
