package shorter;

import shorter.module.Link;
import shorter.sql.MySQL;

public class Main {
	
	public static MySQL mysql;
	public static Link data;
	
	public static void main(String[] args) {
		mysql = new MySQL();
		data = new Link();
	}
	
	public static MySQL getSQL() {
		return mysql;
	}
	
	public static Link getData() {
		return data;
	}

}
