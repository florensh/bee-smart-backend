package com.fh.lernkarten.domain.studySession;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fh.lernkarten.domain.deck.Card;
import com.fh.lernkarten.domain.deck.Deck;

@Document
public class StudySession {

	@Id
	private String id;

	private Set<Card> knownCards = new HashSet<Card>();
	private Set<Card> unknownCards = new HashSet<Card>();
	private Date date;
	
	@DBRef
	private Deck deck;

	public Set<Card> getKnownCards() {
		return knownCards;
	}

	public void setKnownCards(Set<Card> knownCards) {
		this.knownCards = knownCards;
	}

	public Set<Card> getUnknownCards() {
		return unknownCards;
	}

	public void setUnknownCards(Set<Card> unknownCards) {
		this.unknownCards = unknownCards;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
