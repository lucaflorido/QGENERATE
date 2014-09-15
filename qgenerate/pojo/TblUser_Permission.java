package qgenerate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import qgenerate.vo.IVo;

import qgenerate.vo.User_Permission;

@Entity
@Table(name="User_Permission")
public class TblUser_Permission implements ITbl {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idUserPermission")
	private int idUserPermission;
	@ManyToOne
	@JoinColumn(name = "idUser")
	private TblUser user;
	@ManyToOne
	@JoinColumn(name = "idPermission")
	private TblPermission permission;
	public int getIdUserPermission() {
		return idUserPermission;
	}
	public void setIdUserPermission(int idUserPermission) {
		this.idUserPermission = idUserPermission;
	}
	public TblUser getUser() {
		return user;
	}
	public void setUser(TblUser user) {
		this.user = user;
	}
	public TblPermission getPermission() {
		return permission;
	}
	public void setPermission(TblPermission permission) {
		this.permission = permission;
	}
	public void convertToTable(IVo obj){
		User_Permission up = (User_Permission) obj;
		this.idUserPermission = up.getIdUserPermission();
		if (up.getPermission() != null){
			this.permission = new TblPermission();
			this.permission.convertToTable(up.getPermission());
		}
		if(up.getUser() != null){
			this.user = new TblUser();
			this.user.convertToTable(up.getUser());
		}
	}
}
