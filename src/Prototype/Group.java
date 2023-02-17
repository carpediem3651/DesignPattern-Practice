package Prototype;

import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Shape, Prototype {
	private ArrayList<Shape> shapeList = new ArrayList<Shape>();
	
	private String name;
	
	public Group(String name) {
		this.name = name;
	}
	
	Group addShape(Shape shape) {
		shapeList.add(shape);
		return this;
	}

	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}

	public void setShapeList(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object copy() {
		Group newGroup = new Group(name);
		
		Iterator<Shape> iter = shapeList.iterator();
		while(iter.hasNext()) {
			Prototype shape = (Prototype)iter.hasNext();
			newGroup.shapeList.add(Shape)shape.copy());
		}
	}

	@Override
	public String draw() {
		StringBuffer result = new StringBuffer(name);
		result.append("(");
		
		Iterator<Shape> iter = shapeList.iterator();
		while(iter.hasNext()) {
			Shape shape = iter.next();
			result.append(shape.draw());
			if(iter.hasNext()) {
				result.append(" ");
			}
		}
		
		result.append(")");
		return result.toString();
	}

	@Override
	public void moveOffset(int dx, int dy) {
		Iterator<Shape> iter = shapeList.iterator();
		while(iter.hasNext()) {
			Shape shape = iter.next();
			shape.moveOffset(dx, dy);
		}
	}
}
