package edu.cnm.deepdive;

import java.util.Arrays;

public class CanisLupusFamiliaris extends CanisLupus implements Trainable{

	private boolean goodBoy;
	
	public CanisLupusFamiliaris() {
	this(true);
	System.out.println("CanisLupusFamiliaris: : new");
	}

	
	public CanisLupusFamiliaris(boolean goodBoy) {
		this.goodBoy = goodBoy;
	}
	@Override
	public void vocalize() {
		System.out.println("Bark!");	
		}

	@Override
	public String toString() {
		return super.toString() + (goodBoy ? " and I am a good boy." : " and I am most definitely not a good boy.");
	}

	public static void about() {
		System.out.println("Canis Lupus Familiaris is a subspecies of Canis Lupus, produced through selective breeding.");
	}
@Override
public void perform() {
	System.out.println("Play fetch");
	

	}

}
