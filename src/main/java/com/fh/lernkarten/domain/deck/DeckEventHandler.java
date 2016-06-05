package com.fh.lernkarten.domain.deck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@RepositoryEventHandler
@Component
public class DeckEventHandler {
	
	@Autowired
	private DeckRepository deckRepository;
	
	@HandleBeforeCreate
	@HandleBeforeSave
	public void removeOldDeck(Deck deck){
//		this.deckRepository.deleteAll();
	}

}
