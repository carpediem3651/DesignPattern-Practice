package AbstractFactory;

public class MainEntry {

	public static void main(String[] args) {
		ComponentFactory factory = new WindowsFactory();
		
		Button button = factory.createButton("Ȯ��");
		CheckBox checkBox = factory.createCheckBox(false);
		TextEdit textEdit = factory.createTextEdit("����������");
		
		button.render();
		checkBox.render();
		textEdit.render();
	}
}
