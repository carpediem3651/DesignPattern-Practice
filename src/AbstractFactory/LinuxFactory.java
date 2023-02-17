package AbstractFactory;

public class LinuxFactory extends ComponentFactory{

	@Override
	public Button createButton(String caption) {
		// TODO Auto-generated method stub
		return new LinuxButton(caption);
	}

	@Override
	public CheckBox createCheckBox(boolean bChecked) {
		return new LinuxCheckBox(bChecked);
	}

	@Override
	public TextEdit createTextEdit(String value) {
		// TODO Auto-generated method stub
		return new LinuxTextEdit(value);
	}

}
