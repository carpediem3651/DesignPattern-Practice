package AbstractFactory;

public class LinuxTextEdit extends TextEdit{

	public LinuxTextEdit(String value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render() {
		System.out.println("Linux ������ API�� �̿���"+this.value+"���� ����"+"�ؽ�Ʈ����Ʈ�� �׸��ϴ�.");

		
	}

}
