package qgenerate.vo;



import qgenerate.pojo.ITbl;
import qgenerate.pojo.TblContact;
import qgenerate.transfer.QGError;
import qgenerate.transfer.QGObject;
import qgenerate.transfer.QGObjectSuccess;
import qgenerate.util.DataUtilConverter;



public class Contact implements IVo {
	private int idContact;
	private String name;
	private String surname;
	private String birthdate;
	private String phone1;
	private String phone2;
	private String mobile1;
	private String mobile2;
	private String email;
	private String skype;
	private String facebook;
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
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
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
	public void convertFromTable(ITbl obj){
		TblContact c = (TblContact)obj;
		this.birthdate = DataUtilConverter.convertStringFromDate(c.getBirthdate());
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
	public QGObject checkMainFields(){
		if (this.name == null || this.name.equals(""))
			return new QGError("Nome non inserito");
		if (this.surname == null || this.surname.equals(""))
			return new QGError("Cognome non inserito");
		if (this.birthdate == null || this.birthdate.equals(""))
			return new QGError("Data di nascita non inserita");
		if (this.phone1 == null || this.phone1.equals(""))
			return new QGError("Recapito telefonico non inserito");
		if (this.email == null || this.email.equals(""))
			return new QGError("Email non inserita");
		return new QGObjectSuccess();
	}
}
