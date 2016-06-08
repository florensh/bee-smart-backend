package com.fh.lernkarten.domain.deck;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.fh.lernkarten.domain.studySession.StudySession;

public class Deck {

	@Id
	private String id;

	private String name;
	
	@DBRef
	private List<StudySession> sessions;
	
	public void addCards(Collection<Card> cards){
		this.cards.addAll(cards);
	}

	private Set<Card> cards;

	public Set<Card> getCards() {
		return cards;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}

//class Card {
//
//	private String question;
//
//	private String answer;
//
//	public String getAnswer() {
//		return answer;
//	}
//
//	public String getQuestion() {
//		return question;
//	}
//
//	public void setAnswer(String answer) {
//		this.answer = answer;
//	}
//
//	public void setQuestion(String question) {
//		this.question = question;
//	}
//}