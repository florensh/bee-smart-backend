package com.fh.lernkarten.domain.deck;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface DeckRepository  extends PagingAndSortingRepository<Deck, String> {
	
	Deck findByName(String name);

}
