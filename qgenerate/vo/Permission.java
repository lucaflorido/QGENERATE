package qgenerate.vo;

import qgenerate.pojo.ITbl;
import qgenerate.pojo.TblPermission;



public class Permission implements IVo{
	private int idPermission;
	private boolean perm_create;
	private boolean perm_read;
	private boolean perm_update;
	private boolean perm_delete;
	public int getIdPermission() {
		return idPermission;
	}
	public void setIdPermission(int idPermission) {
		this.idPermission = idPermission;
	}
	public boolean isPerm_create() {
		return perm_create;
	}
	public void setPerm_create(boolean perm_create) {
		this.perm_create = perm_create;
	}
	public boolean isPerm_read() {
		return perm_read;
	}
	public void setPerm_read(boolean perm_read) {
		this.perm_read = perm_read;
	}
	public boolean isPerm_update() {
		return perm_update;
	}
	public void setPerm_update(boolean perm_update) {
		this.perm_update = perm_update;
	}
	public boolean isPerm_delete() {
		return perm_delete;
	}
	public void setPerm_delete(boolean perm_delete) {
		this.perm_delete = perm_delete;
	}
	public void convertFromTable(ITbl obj){
		TblPermission p = (TblPermission)obj;
		this.idPermission = p.getIdPermission();
		this.perm_create = p.isPerm_create();
		this.perm_delete = p.isPerm_delete();
		this.perm_read = p.isPerm_read();
		this.perm_update = p.isPerm_update();
	}
}
