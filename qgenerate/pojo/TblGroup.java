package qgenerate.pojo;

public class TblGroup implements ITbl {
	private int idGroup;
	private String name;
	private TblGroupType type;
	private TblProject project;
	public int getIdGroup() {
		return idGroup;
	}
	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TblGroupType getType() {
		return type;
	}
	public void setType(TblGroupType type) {
		this.type = type;
	}
	public TblProject getProject() {
		return project;
	}
	public void setProject(TblProject project) {
		this.project = project;
	}
	
}
