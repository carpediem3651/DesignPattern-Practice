package AbstractFactory;

public class WindowsFactory extends ComponentFactory{

	@Override
	public Button createButton(String caption) {
		// TODO Auto-generated method stub
		return new WindowsButton(caption);
	}

	@Override
	public CheckBox createCheckBox(boolean bChecked) {
		// TODO Auto-generated method stub
		return new WindowsCheckBox(bChecked);
	}

	@Override
	public TextEdit createTextEdit(String value) {
		// TODO Auto-generated method stub
		return new WindowTextEdit(value);
	}

}
