package qgenerate.pojo;

public class TblConsumer implements ITbl{
	private int idConsumer;
	private TblContact contact;
	private TblAddress address;
	private TblUser user;
	public int getIdConsumer() {
		return idConsumer;
	}
	public void setIdConsumer(int idConsumer) {
		this.idConsumer = idConsumer;
	}
	public TblContact getContact() {
		return contact;
	}
	public void setContact(TblContact contact) {
		this.contact = contact;
	}
	public TblAddress getAddress() {
		return address;
	}
	public void setAddress(TblAddress address) {
		this.address = address;
	}
	public TblUser getUser() {
		return user;
	}
	public void setUser(TblUser user) {
		this.user = user;
	}
	
}
