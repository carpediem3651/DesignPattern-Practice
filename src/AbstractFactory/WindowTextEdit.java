package AbstractFactory;

public class WindowTextEdit extends TextEdit{

	public WindowTextEdit(String value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render() {
		System.out.println("Windows ������ API�� �̿���"+this.value+"���� ����"+"�ؽ�Ʈ����Ʈ�� �׸��ϴ�.");
	}

}
