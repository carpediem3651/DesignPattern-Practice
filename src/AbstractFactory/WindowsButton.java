package AbstractFactory;

public class WindowsButton extends Button{

	public WindowsButton(String caption) {
		super(caption);
	}

	@Override
	void render() {
		System.out.println(
				"Window ������ API�� �̿���"+this.caption +"��ư�� �׸��ϴ�.");				
	}
	
	
}
