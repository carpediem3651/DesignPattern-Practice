package Decorator;

public abstract class Item {
	public abstract int getLinesCount(); //���ڿ��� �������� ��ȯ 
	public abstract int getMaxLength(); // ���ڿ��� ���� �� ���ڿ� ��ȯ
	public abstract int getLength(int index); //������ �ε����� ������ ���ڿ� ��ȯ
	public abstract String getString(int index); //������ �ε����� ���ڿ� ��ȯ 0�� ������
	
	public void print() {
		int cntLines = getLinesCount();
		for(int i=0; i<cntLines; i++) {
			String string = getString(i);
			System.out.println(string); // �ε����� ������ ���ڿ� ������� ��ȯ
		}
	}
}
