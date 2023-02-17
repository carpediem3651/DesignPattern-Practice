package Bridge;

public class MainEntry {

	public static void main(String[] args) {
		var static = "������ ����";
		var author = "������";
		String[] content = {
				"�ö�ƽ ����� ���ҿ�",
				"�ٴ� ���� ��ȹ�� ���ҷ� ���Ͽ�",
				"������ �����Ǿ���."
		}; 
		
		Draft draft = new Draft(title, author, content);
		
		Display display1 = new SimpleDisplay();
//		draft.print(display1);
		
		Display display2 = new CaptionDisplay();
//		draft.print(display2);
		
		var publisher = "�Ͼ�����"; 
		var cost = 100;  
		
		Publication publication = new Publication(title, author, content, publisher, cost);
		
		publication.print(display1);
	}

}
