package AbstractFactory;

public class LinuxButton extends Button{

	public LinuxButton(String caption) {
		super(caption);
	}

	@Override
	void render() {
		System.out.println(
				"Linux ������ API�� �̿���"+this.caption +"��ư�� �׸��ϴ�.");		
	}

}
