package qgenerate.pojo;

public class TblAnswer implements ITbl {
	private int idAnswer;
	private boolean correct;
	private TblAnswerType type;
	private TblQuestion question;
	public int getIdAnswer() {
		return idAnswer;
	}
	public void setIdAnswer(int idAnswer) {
		this.idAnswer = idAnswer;
	}
	public boolean isCorrect() {
		return correct;
	}
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	public TblAnswerType getType() {
		return type;
	}
	public void setType(TblAnswerType type) {
		this.type = type;
	}
	public TblQuestion getQuestion() {
		return question;
	}
	public void setQuestion(TblQuestion question) {
		this.question = question;
	}
	
}
