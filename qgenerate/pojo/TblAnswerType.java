package qgenerate.pojo;

public class TblAnswerType implements ITbl {
	private int idAnswerType;
	private String code;
	private String name;
	private String description;
	public int getIdAnswerType() {
		return idAnswerType;
	}
	public void setIdAnswerType(int idAnswerType) {
		this.idAnswerType = idAnswerType;
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
