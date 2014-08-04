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
@Table(name="Permission")
public class TblPermission implements ITbl {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idPermission")
	private int idPermission;
	@Column(name="perm_create")
	private boolean perm_create;
	@Column(name="perm_read")
	private boolean perm_read;
	@Column(name="perm_update")
	private boolean perm_update;
	@Column(name="perm_delete")
	private boolean perm_delete;
	/*@ManyToOne
	@JoinColumn(name = "idProject")
	private TblProject project;*/
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
	/*
	public TblProject getProject() {
		return project;
	}
	public void setProject(TblProject project) {
		this.project = project;
	}*/
	
}
