package Facade;

import java.util.HashMap;

public class DBMS {
	private HashMap<String, Row> db = new HashMap<String, Row>();
	
	public DBMS() {
		db.put("jane",  new Row("Jane", "1990-12-31", "zxmcn@google.com"));
		db.put("bella",  new Row("bella", "1991-12-31", "zxsasn@google.com"));
		db.put("joy",  new Row("joy", "1994-12-31", "zcccd@google.com"));
	}
	
	public Row query(String name) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return db.get(name.toLowerCase());
	} 
}
