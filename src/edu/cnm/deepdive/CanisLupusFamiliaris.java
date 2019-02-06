package edu.cnm.deepdive;

import java.util.Arrays;

public class CanisLupusFamiliaris extends CanisLupus {

	private boolean goodBoy;
	
	public CanisLupusFamiliaris() {
		this(true);
		System.out.println("CanisLupusFamiliaris::new");
		getData()[2] = 5;
		System.out.println(Arrays.toString(getData()));
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

}
