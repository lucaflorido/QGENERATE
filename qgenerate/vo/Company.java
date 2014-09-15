package qgenerate.vo;

import qgenerate.pojo.ITbl;
import qgenerate.pojo.TblCompany;
import qgenerate.transfer.QGError;
import qgenerate.transfer.QGObject;
import qgenerate.transfer.QGObjectSuccess;
import qgenerate.transfer.QGParameter;



public class Company implements IVo {
	private int idCompany;
	private String name;
	private Address address;
	private Contact contact;
	private boolean active;
	private String taxcode;
	private String serialnumber;
	public int getIdCompany() {
		return idCompany;
	}
	public void setIdCompany(int idCompany) {
		this.idCompany = idCompany;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getTaxcode() {
		return taxcode;
	}
	public void setTaxcode(String taxcode) {
		this.taxcode = taxcode;
	}
	public String getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}
	public void convertFromTable(ITbl obj){
		TblCompany c = (TblCompany)obj;
		if (c.getAddress() != null){
			this.address = new Address();
			this.address.convertFromTable(c.getAddress());
		}
		this.active = c.isActive();
		if (c.getContact() != null){
			this.contact = new Contact();
			this.contact.convertFromTable(c.getContact());
		}
		this.idCompany = c.getIdCompany();
		this.name = c.getName();
		this.serialnumber = c.getSerialnumber();
		this.taxcode = c.getTaxcode();
	}
	public QGObject checkMainFields(){
		if (this.name == null || this.name.equals(""))
			return new QGError("Nome non inserito");
		if (this.contact == null)
			return new QGError("Contatto non inserito");
		else if (this.contact.checkMainFields().getType().equals(QGParameter.error))
			return (this.contact.checkMainFields());
		if (this.address == null)
			return new QGError("Indirizzo non inserito");
		else if (this.address.checkMainFields().getType().equals(QGParameter.error))
			return (this.address.checkMainFields());
		if ((this.serialnumber == null || this.serialnumber.equals("")) && (this.taxcode == null || this.taxcode.equals("")))
			return new QGError("Partita iva o Codice fiscale non inseriti");
		
		return new QGObjectSuccess();
	}
}
