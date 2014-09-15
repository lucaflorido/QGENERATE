package qgenerate.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import qgenerate.vo.Company;
import qgenerate.vo.IVo;

@Entity
@Table(name="Company")
public class TblCompany implements ITbl {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idCompany")
	private int idCompany;
	@Column(name="name")
	private String name;
	@ManyToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "idAddress")
	private TblAddress address;
	@ManyToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "idContact")
	private TblContact contact;
	@Column(name="active")
	private boolean active;
	@Column(name="taxcode")
	private String taxcode;
	@Column(name="serialnumber")
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
	public TblAddress getAddress() {
		return address;
	}
	public void setAddress(TblAddress address) {
		this.address = address;
	}
	public TblContact getContact() {
		return contact;
	}
	public void setContact(TblContact contact) {
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
	public void convertToTable(IVo obj){
		Company c = (Company)obj;
		if (c.getAddress() != null){
			this.address = new TblAddress();
			this.address.convertToTable(c.getAddress());
		}
		this.active = c.isActive();
		if (c.getContact() != null){
			this.contact = new TblContact();
			this.contact.convertToTable(c.getContact());
		}
		this.idCompany = c.getIdCompany();
		this.name = c.getName();
		this.serialnumber = c.getSerialnumber();
		this.taxcode = c.getTaxcode();
	}
	
}
