package com.fh.lernkarten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fh.lernkarten.domain.deck.Deck;
import com.fh.lernkarten.domain.deck.DeckRepository;

@RepositoryRestController
@RequestMapping("/cards")
public class CardController {

	@Autowired
	private DeckRepository deckRepository;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Deck> mergeDeck(@RequestBody Deck d) {

		Deck fromDb = this.deckRepository.findByName(d.getName());
		if (fromDb != null) {
			fromDb.addCards(d.getCards());
			Deck saved = this.deckRepository.save(fromDb);
			return new ResponseEntity<Deck>(saved, HttpStatus.CREATED);

		}else{
			Deck saved = this.deckRepository.save(d);
			return new ResponseEntity<Deck>(saved, HttpStatus.CREATED);
		}

	}

}
