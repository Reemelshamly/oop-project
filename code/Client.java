
public class Client extends Person {
    private int ClientId;

private String contactinfo;
//fy case history yeb2a array list
public Client(int clientId, String contactinfo) {
	super();
	this.ClientId = clientId;

	this.contactinfo = contactinfo;
}
public int getClientId() {
	return ClientId;
}
public void setClientId(int clientId) {
	ClientId = clientId;
}

public String getContactinfo() {
	return contactinfo;
}
public void setContactinfo(String contactinfo) {
	this.contactinfo = contactinfo;
}

}