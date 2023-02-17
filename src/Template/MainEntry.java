package Template;

import java.util.ArrayList;

public class MainEntry {

	public static void main(String[] args) {
		String title = "����������";
		
		ArrayList<String> content = new ArrayList<String>();
		content.add("������������ Ŭ���� ���� ȿ�����̰� ����ȭ�� ���踦 �����ϴ� ���Դϴ�.");
		content.add("�� ������ �ܿ�� ���� �����ϴ� ���� �߿��մϴ�.");
		content.add("�پ��� ������ ���ϰ� �ݺ������� �����Ҽ���");
		content.add("�� ���������Ͽ� ���� ���� ���� �ξ��� ���Դϴ�.");
		
		String footer = "2023.2.8 carpediem3651";
		
		Article article = new Article(title, content, footer);
		
		System.out.println("[CASE-1]");
		DisplayArticleTemplate style1 = new SimpleDisplayArticle(article);
		style1.display();
		
		System.out.println();
		
		System.out.println("[CASE-2]");
		DisplayArticleTemplate style2 = new CaptionDisplayAricle(article);
		style1.display();
		
		System.out.println();
	}

}
