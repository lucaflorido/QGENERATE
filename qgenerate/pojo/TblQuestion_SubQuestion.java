package qgenerate.pojo;

public class TblQuestion_SubQuestion {
	private int idQuestionSubQuestion;
	private TblQuestion master;
	private TblQuestion slave;
	private TblAnswer answer;
	public int getIdQuestionSubQuestion() {
		return idQuestionSubQuestion;
	}
	public void setIdQuestionSubQuestion(int idQuestionSubQuestion) {
		this.idQuestionSubQuestion = idQuestionSubQuestion;
	}
	public TblQuestion getMaster() {
		return master;
	}
	public void setMaster(TblQuestion master) {
		this.master = master;
	}
	public TblQuestion getSlave() {
		return slave;
	}
	public void setSlave(TblQuestion slave) {
		this.slave = slave;
	}
	public TblAnswer getAnswer() {
		return answer;
	}
	public void setAnswer(TblAnswer answer) {
		this.answer = answer;
	}
	
}
