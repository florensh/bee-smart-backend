package com.fh.lernkarten.domain.deck;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeckRepository  extends MongoRepository<Deck, String> {
	
	Deck findByName(String name);

}
