
public class PersonItem {
	 String mail_id; 
	 String name;

	public PersonItem(String mailId, String name) {
		this.mail_id = mailId;
		this.name = name;
	}

	public String getKey() {
		return mail_id;
	}

public String getValue()
{ return name; }
//--------------------------------------------------------------
}  // end class DataItem
////////////////////////////////////////////////////////////////
