package AbstractFactory;

public class LunuxCheckBox extends CheckBox{

	public LunuxCheckBox(boolean bChecked) {
		super(bChecked);
		// TODO Auto-generated constructor stub
	}

	@Override
	void render() {
		System.out.println(
				"Linux ������ API�� �̿���"+(this.bChecked ? "üũ��" : "üũ �ȵ�") +"üũ �ڽ��� �׸��ϴ�.");		
	}

}
