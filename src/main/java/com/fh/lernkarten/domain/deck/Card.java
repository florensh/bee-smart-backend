package com.fh.lernkarten.domain.deck;

public class Card {
	private String question;

	private String answer;

	public String getAnswer() {
		return answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
}
