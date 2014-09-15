package qgenerate.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import qgenerate.util.DataUtilConverter;
import qgenerate.vo.Contact;
import qgenerate.vo.IVo;
@Entity
@Table(name="Contact")
public class TblContact implements ITbl {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idContact")
	private int idContact;
	@Column(name="name")
	private String name;
	@Column(name="surname")
	private String surname;
	@Column(name="birthdate")
	private Date birthdate;
	@Column(name="phone1")
	private String phone1;
	@Column(name="phone2")
	private String phone2;
	@Column(name="mobile1")
	private String mobile1;
	@Column(name="mobile2")
	private String mobile2;
	@Column(name="email")
	private String email;
	@Column(name="skype")
	private String skype;
	@Column(name="facebook")
	private String facebook;
	@Column(name="twitter")
	private String twitter;
	public int getIdContact() {
		return idContact;
	}
	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getMobile1() {
		return mobile1;
	}
	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}
	public String getMobile2() {
		return mobile2;
	}
	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSkype() {
		return skype;
	}
	public void setSkype(String skype) {
		this.skype = skype;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public void convertToTable(IVo obj){
		Contact c = (Contact)obj;
		this.birthdate = DataUtilConverter.convertDateFromString(c.getBirthdate());
		this.email = c.getEmail();
		this.facebook = c.getFacebook();
		this.idContact = c.getIdContact();
		this.mobile1 = c.getMobile1();
		this.mobile2 = c.getMobile2();
		this.name = c.getName();
		this.phone1 = c.getPhone1();
		this.phone2 = c.getPhone2();
		this.skype = c.getSkype();
		this.surname = c.getSurname();
		this.twitter = c.getTwitter();
	}
}
