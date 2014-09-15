package qgenerate.vo;



import qgenerate.pojo.ITbl;
import qgenerate.pojo.TblPartner;
import qgenerate.transfer.QGError;
import qgenerate.transfer.QGObject;
import qgenerate.transfer.QGObjectSuccess;
import qgenerate.transfer.QGParameter;


public class Partner  implements IVo{
	private int idPartner;
	private Contact contact;
	private User user;
	private Company company;
	public int getIdPartner() {
		return idPartner;
	}
	public void setIdPartner(int idPartner) {
		this.idPartner = idPartner;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public void convertFromTable(ITbl obj){
		TblPartner p = (TblPartner)obj;
		this.idPartner = p.getIdPartner();
		if (p.getCompany() != null){
			this.company = new Company();
			this.company.convertFromTable(p.getCompany());
		}
		if (p.getContact() != null){
			this.contact = new Contact();
			this.contact.convertFromTable(p.getContact());
		}
		if (p.getUser() != null){
			this.user = new User();
			this.user.convertFromTable(p.getUser());
		}
	}
	public QGObject checkMainFields(){
		if (this.contact == null)
			return new QGError("Contatto non inserito");
		else if (this.contact.checkMainFields().getType().equals(QGParameter.error))
			return (this.contact.checkMainFields());
		if (this.company == null)
			return new QGError("Contatto non inserito");
		else if (this.company.checkMainFields().getType().equals(QGParameter.error))
			return (this.company.checkMainFields());
		if (this.user == null)
			return new QGError("Contatto non inserito");
		else if (this.user.checkMainFields().getType().equals(QGParameter.error))
			return (this.user.checkMainFields());
		return new QGObjectSuccess();
		
	}
}
