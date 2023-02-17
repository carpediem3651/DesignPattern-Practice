package Decorator;

import java.util.ArrayList;
import java.util.Iterator;

public class Strings extends Item {
	private ArrayList<String> strings = new ArrayList<String>();
	
	public void add(String item) {
		strings.add(item);
	}

	@Override
	public int getLinesCount() {
		return strings.size(); //문자열이 몇줄인지 반환 
	} 

	@Override
	public int getMaxLength() { // 문자열중 가장 긴 문자열 반환
		Iterator<String> iter = strings.iterator();
		int maxWidth = 0;
		
		while(iter.hasNext()) {
			String string = iter.next();
			int width = string.length();
			
			if(width > maxWidth) maxWidth = width;
		}
		
		return maxWidth;
	}

	@Override
	public int getLength(int index) {
		String string = strings.get(index);
		return string.length(); //지정된 인덱스의 지정된 문자열 반환
	}

	@Override
	public String getString(int index) { //지정된 인덱스에 문자열 반환 0이 시작점
		String string = strings.get(index);
		return string;
	}
}
