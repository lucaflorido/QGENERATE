package qgenerate.pojo;

public class TblQuestion implements ITbl {
	private int idQuestion;
	private String code;
	private String text;
	private TblQuestionType type;
	private TblSubQuestionType subtype;
	private TblGroup group;
	public int getIdQuestion() {
		return idQuestion;
	}
	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public TblQuestionType getType() {
		return type;
	}
	public void setType(TblQuestionType type) {
		this.type = type;
	}
	public TblSubQuestionType getSubtype() {
		return subtype;
	}
	public void setSubtype(TblSubQuestionType subtype) {
		this.subtype = subtype;
	}
	public TblGroup getGroup() {
		return group;
	}
	public void setGroup(TblGroup group) {
		this.group = group;
	}
	
}
