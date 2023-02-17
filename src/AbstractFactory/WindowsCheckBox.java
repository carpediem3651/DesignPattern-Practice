package AbstractFactory;

public class WindowsCheckBox extends CheckBox{

	public WindowsCheckBox(boolean bChecked) {
		super(bChecked);
	}

	@Override
	void render() {
		System.out.println(
				"Window ������ API�� �̿���"+(this.bChecked ? "üũ��" : "üũ �ȵ�") +"üũ �ڽ��� �׸��ϴ�.");		
	}
	
}
