package qgenerate.vo;

import qgenerate.pojo.ITbl;
import qgenerate.pojo.TblUser_Permission;



public class User_Permission implements IVo{
	private int idUserPermission;
	private User user;
	private Permission permission;
	public int getIdUserPermission() {
		return idUserPermission;
	}
	public void setIdUserPermission(int idUserPermission) {
		this.idUserPermission = idUserPermission;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Permission getPermission() {
		return permission;
	}
	public void setPermission(Permission permission) {
		this.permission = permission;
	}
	public void convertFromTable(ITbl obj){
		TblUser_Permission up = (TblUser_Permission) obj;
		this.idUserPermission = up.getIdUserPermission();
		if (up.getPermission() != null){
			this.permission = new Permission();
			this.permission.convertFromTable(up.getPermission());
		}
		if(up.getUser() != null){
			this.user = new User();
			this.user.convertFromTable(up.getUser());
		}
	}
}
