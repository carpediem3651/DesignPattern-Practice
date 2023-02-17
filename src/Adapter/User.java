package Adapter;

import java.util.ArrayList;

public class User {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog("大大捞"));
		animals.add(new Cat("具克捞"));
		animals.add(new Cat("功功"));
//		animals.add(new Tiger("戚摹"));
		animals.add(new TigerAdapter("戚摹"));
		
		animals.forEach(animal -> {
			animal.sound();
		});
	}

}
 