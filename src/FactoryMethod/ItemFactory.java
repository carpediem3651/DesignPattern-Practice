package FactoryMethod;

import java.util.HashMap;

public class ItemFactory extends Factory{
	private class ItemData {
		int maxCount;
		int currentCount;
		ItemData(int maxCount) {
			this.maxCount = maxCount;
		}
	}
	
	private HashMap<String, ItemData> repository;
	
	public ItemFactory() {
		repository = new HashMap<String, ItemData>();
		repository.put("sword", new ItemData(3));
		repository.put("shield", new ItemData(2));
		repository.put("bow", new ItemData(1));
	}

	@Override
	public boolean iscreatable(String name) {
		ItemData itemData = repository.get(name);
		
		if(itemData == null) {
			System.out.println(name + "�� �� �� ���� �������Դϴ�.");
			return false;
		}
		
		if(itemData.currentCount >= itemData.maxCount) {
			System.out.println(name +"�� ǰ�� �������Դϴ�.");
			return false;
		}
		return true;
	}

	@Override
	public Item createItem(String name) {
		Item item = null;
		
		if(name == "sword") item = new Sword();
		if(name == "shield") item = new Shield();
		if(name == "bow") item = new Bow();
		
		return null;
	}

	@Override
	public void postprocessItem(String name) {
		ItemData itemData = repository.get(name);
		if(itemData != null) itemData.currentCount++;
	}

}
