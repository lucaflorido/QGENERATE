package qgenerate.vo;



import qgenerate.pojo.ITbl;
import qgenerate.pojo.TblUser;
import qgenerate.transfer.QGError;
import qgenerate.transfer.QGObject;
import qgenerate.transfer.QGObjectSuccess;
import qgenerate.transfer.QGParameter;

public class User implements IVo{
	private int idUser;
	private String username;
	private String password;
	private String email;
	private boolean active;
	private boolean admin;
	private boolean consumer;
	private int code;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public boolean isConsumer() {
		return consumer;
	}
	public void setConsumer(boolean consumer) {
		this.consumer = consumer;
	}
	public void convertFromTable(ITbl obj){
		TblUser u = (TblUser)obj;
		this.active = u.isActive();
		this.admin = u.isAdmin();
		this.consumer = u.isConsumer();
		this.email = u.getEmail();
		this.idUser = u.getIdUser();
		this.password = u.getPassword();
		this.username = u.getUsername();
		this.code = u.getCode();
	}
	public QGObject checkMainFields(){
		if (this.username == null || this.username.equals(""))
			return new QGError("Nome utente non inserito");
		if (this.password == null || this.password.equals(""))
			return new QGError("Password non inserita");
		
		return new QGObjectSuccess();
	}
}
