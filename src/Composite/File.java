package Composite;

public class File extends Unit{
	private int size;
	
	public File(String name) {
		super(name);
	}

	@Override
	public int getSize() {
		return size;
	}

}
