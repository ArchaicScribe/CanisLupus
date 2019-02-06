package edu.cnm.deepdive;

import java.util.Arrays;

public class CanisLupus extends Canis {

	public CanisLupus() {
		System.out.println("Canis Lupus::new");
		System.out.println(Arrays.toString(getData()));
	}

	
	@Override
	public void vocalize() {
		System.out.println("Howl!");
	}
	@Override
	public void hunt() {
		System.out.println("Hunt prey in packs");

	}
	public static void about() {
		System.out.println("Canis Lupus is a species of Canis, commonly known as the grey or timber wolf.");
	}

	
}
