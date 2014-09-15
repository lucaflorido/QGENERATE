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





import qgenerate.vo.IVo;
import qgenerate.vo.Partner;


@Entity
@Table(name="Partner")
public class TblPartner implements ITbl {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idPartner")
	private int idPartner;
	@ManyToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "idContact")
	private TblContact contact;
	@ManyToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "idUser")
	private TblUser user;
	@ManyToOne(cascade = CascadeType.ALL )
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
	public void convertToTable(IVo obj){
		Partner p = (Partner)obj;
		this.idPartner = p.getIdPartner();
		if (p.getCompany() != null){
			this.company = new TblCompany();
			this.company.convertToTable(p.getCompany());
		}
		if (p.getContact() != null){
			this.contact = new TblContact();
			this.contact.convertToTable(p.getContact());
		}
		if (p.getUser() != null){
			this.user = new TblUser();
			this.user.convertToTable(p.getUser());
		}
	}
}
