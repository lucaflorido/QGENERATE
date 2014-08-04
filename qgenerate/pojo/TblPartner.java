package qgenerate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Partner")
public class TblPartner implements ITbl {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idPartner")
	private int idPartner;
	@ManyToOne
	@JoinColumn(name = "idContact")
	private TblContact contact;
	@ManyToOne
	@JoinColumn(name = "idUser")
	private TblUser user;
	@ManyToOne
	@JoinColumn(name = "idCompany")
	private TblCompany company;
	public int getIdPartner() {
		return idPartner;
	}
	public void setIdPartner(int idPartner) {
		this.idPartner = idPartner;
	}
	public TblContact getContact() {
		return contact;
	}
	public void setContact(TblContact contact) {
		this.contact = contact;
	}
	public TblUser getUser() {
		return user;
	}
	public void setUser(TblUser user) {
		this.user = user;
	}
	public TblCompany getCompany() {
		return company;
	}
	public void setCompany(TblCompany company) {
		this.company = company;
	}
	
}
