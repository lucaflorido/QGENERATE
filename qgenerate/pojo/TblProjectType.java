package qgenerate.pojo;

public class TblProjectType implements ITbl {
	private int idProjectType;
	private String code;
	private String name;
	private String description;
	public int getIdProjectType() {
		return idProjectType;
	}
	public void setIdProjectType(int idProjectType) {
		this.idProjectType = idProjectType;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
