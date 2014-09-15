package qgenerate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import qgenerate.vo.IVo;
import qgenerate.vo.User;

@Entity
@Table(name="User")
public class TblUser implements ITbl {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idUser")
	private int idUser;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	@Column(name="active")
	private boolean active;
	@Column(name="admin")
	private boolean admin;
	@Column(name="consumer")
	private boolean consumer;
	@Column(name="code")
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
	public void convertToTable(IVo obj){
		User u = (User)obj;
		this.active = u.isActive();
		this.admin = u.isAdmin();
		this.consumer = u.isConsumer();
		this.email = u.getEmail();
		this.idUser = u.getIdUser();
		this.password = u.getPassword();
		this.username = u.getUsername();
		this.code = u.getCode();
	}
}
