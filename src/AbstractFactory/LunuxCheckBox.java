package AbstractFactory;

public class LunuxCheckBox extends CheckBox{

	public LunuxCheckBox(boolean bChecked) {
		super(bChecked);
		// TODO Auto-generated constructor stub
	}

	@Override
	void render() {
		System.out.println(
				"Linux 렌더링 API를 이용해"+(this.bChecked ? "체크된" : "체크 안된") +"체크 박스를 그립니다.");		
	}

}
