package Decorator;

public abstract class Item {
	public abstract int getLinesCount(); //문자열이 몇줄인지 반환 
	public abstract int getMaxLength(); // 문자열중 가장 긴 문자열 반환
	public abstract int getLength(int index); //지정된 인덱스의 지정된 문자열 반환
	public abstract String getString(int index); //지정된 인덱스에 문자열 반환 0이 시작점
	
	public void print() {
		int cntLines = getLinesCount();
		for(int i=0; i<cntLines; i++) {
			String string = getString(i);
			System.out.println(string); // 인덱스에 지정된 문자열 순서대로 반환
		}
	}
}
