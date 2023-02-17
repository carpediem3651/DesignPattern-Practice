package Bridge;

public class CaptionDisplay implements Display {

	@Override
	public void title(Draft draft) {
		System.out.println("����: " + draft.getTitle());
	}

	@Override
	public void author(Draft draft) {
		System.out.println("����: " + draft.getAuthor());
	}

	@Override
	public void content(Draft draft) {
		System.out.println("����: ");
		var content = draft.getContent();
		for(var i=0; i<content.length; i++) {
			System.out.println("   " + content[i]);
		}
	}  
	
}
