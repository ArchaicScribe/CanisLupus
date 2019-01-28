package edu.cnm.deepdive;

public abstract class Canis {

	public static final int NUMBER_OF_LEGS = 4;
	
	public abstract void vocalize();
	
	public abstract void hunt();

	@Override
	public String toString() {
		return "I am a " + this.getClass().getSimpleName();
	}
	
	
}
