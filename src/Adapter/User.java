package Adapter;

import java.util.ArrayList;

public class User {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog("�����"));
		animals.add(new Cat("�߿���"));
		animals.add(new Cat("����"));
//		animals.add(new Tiger("��ġ"));
		animals.add(new TigerAdapter("��ġ"));
		
		animals.forEach(animal -> {
			animal.sound();
		});
	}

}
 