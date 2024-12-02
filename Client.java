
public class Client {
    private int ClientId;
private String clientname;
private String contactinfo;
//fy case history yeb2a array list
public Client(int clientId, String clientname, String contactinfo) {
	super();
	ClientId = clientId;
	this.clientname = clientname;
	this.contactinfo = contactinfo;
}
public int getClientId() {
	return ClientId;
}
public void setClientId(int clientId) {
	ClientId = clientId;
}
public String getClientname() {
	return clientname;
}
public void setClientname(String clientname) {
	this.clientname = clientname;
}
public String getContactinfo() {
	return contactinfo;
}
public void setContactinfo(String contactinfo) {
	this.contactinfo = contactinfo;
}

}