package qgenerate.pojo;

public class TblSubQuestionType implements ITbl {
	private int idSubQuestionType;
	private TblQuestionType type;
	private String code;
	private String name;
	private String description;
	
	public int getIdSubQuestionType() {
		return idSubQuestionType;
	}
	public void setIdSubQuestionType(int idSubQuestionType) {
		this.idSubQuestionType = idSubQuestionType;
	}
	public TblQuestionType getType() {
		return type;
	}
	public void setType(TblQuestionType type) {
		this.type = type;
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
