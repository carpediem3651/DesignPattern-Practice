package Builder;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
//	    <Pattern 2 테스트 코드>
		
//		Car car1 = new Car("V7", true, "Black", true, false);
//		
//		CarBuilder builder = new CarBuilder()
//			.setAEB(false)
//			//.setAirbag(false)
//			.setCameraSensor(true)
//			.setColor("white")
//			.setEngine("V9");
//			//.build();
//		
//		Random random = new Random();
//		Car car2 = builder
//			.setAirbag(random.nextInt(2) == 0)
//			.build();
//		System.out.println(car1);
//		System.out.println(car2);
		
//		<Pattern 2 테스트 코드>
		Data data = new Data("Jane", 25);
		Builder builder = new PlainTextBuilder(data);
		Director director = new Director(builder);
		String result = director.build();
		System.out.println(result);
	}
}
